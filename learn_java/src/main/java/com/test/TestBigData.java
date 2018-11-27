package com.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wuxiang on 2018/11/27 17:36
 * <p>
 * 如何判断一个元素在亿级数据中是否存在？
 * <p>
 * 前提设置小堆内存：-Xms64m -Xmx64m -XX:+PrintHeapAtGC -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * 参考：https://juejin.im/post/5bfc90be5188254e2a04374b#heading-2
 */
public class TestBigData {

    Integer maxNumber = 10000000;

    /**
     * 常规实现
     */
    @Test
    public void hashMapTest() {
        long star = System.currentTimeMillis();

        Set<Integer> hashset = new HashSet<>(maxNumber);
        for (int i = 0; i < maxNumber; i++) {
            hashset.add(i);
        }
        Assert.assertTrue(hashset.contains(1));
        Assert.assertTrue(hashset.contains(2));
        Assert.assertTrue(hashset.contains(3));

        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star) + "毫秒");
    }

    /**
     * Bloom Filter
     */
    @Test
    public void bloomFilterTest() {
        long star = System.currentTimeMillis();
        BloomFilters bloomFilters = new BloomFilters(maxNumber);
        for (int i = 0; i < maxNumber; i++) {
            bloomFilters.add(i + "");
        }
        Assert.assertTrue(bloomFilters.check(1 + ""));
        Assert.assertTrue(bloomFilters.check(2 + ""));
        Assert.assertTrue(bloomFilters.check(3 + ""));
        Assert.assertTrue(bloomFilters.check(999999 + ""));
        Assert.assertFalse(bloomFilters.check(400230340 + ""));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star) + "毫秒");
    }

}

/**
 * BloomFilters
 * 主要就是用于解决判断一个元素是否在一个集合中，但它的优势是只需要占用很小的内存空间以及有着高效的查询效率
 * <p>
 * 原理：对写入的数据做 H 次 hash 运算定位到数组中的位置，同时将数据改为 1 。
 * 当有数据查询时也是同样的方式定位到数组中。
 * 一旦其中的有一位为 0 则认为数据肯定不存在于集合，否则数据可能存在于集合中。
 */
class BloomFilters {

    /**
     * 数组长度
     */
    private int arraySize;

    /**
     * 数组
     */
    private int[] array;

    public BloomFilters(int arraySize) {
        this.arraySize = arraySize;
        array = new int[arraySize];
    }

    /**
     * 写入数据
     *
     * @param key
     */
    public void add(String key) {
        int first = hashcode_1(key);
        int second = hashcode_2(key);
        int third = hashcode_3(key);

        array[first % arraySize] = 1;
        array[second % arraySize] = 1;
        array[third % arraySize] = 1;

    }

    /**
     * 判断数据是否存在
     *
     * @param key
     * @return
     */
    public boolean check(String key) {
        int first = hashcode_1(key);
        int second = hashcode_2(key);
        int third = hashcode_3(key);

        int firstIndex = array[first % arraySize];
        if (firstIndex == 0) {
            return false;
        }

        int secondIndex = array[second % arraySize];
        if (secondIndex == 0) {
            return false;
        }

        int thirdIndex = array[third % arraySize];
        if (thirdIndex == 0) {
            return false;
        }

        return true;

    }


    /**
     * hash 算法1
     *
     * @param key
     * @return
     */
    private int hashcode_1(String key) {
        int hash = 0;
        int i;
        for (i = 0; i < key.length(); ++i) {
            hash = 33 * hash + key.charAt(i);
        }
        return Math.abs(hash);
    }

    /**
     * hash 算法2
     *
     * @param data
     * @return
     */
    private int hashcode_2(String data) {
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < data.length(); i++) {
            hash = (hash ^ data.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        return Math.abs(hash);
    }

    /**
     * hash 算法3
     *
     * @param key
     * @return
     */
    private int hashcode_3(String key) {
        int hash, i;
        for (hash = 0, i = 0; i < key.length(); ++i) {
            hash += key.charAt(i);
            hash += (hash << 10);
            hash ^= (hash >> 6);
        }
        hash += (hash << 3);
        hash ^= (hash >> 11);
        hash += (hash << 15);
        return Math.abs(hash);
    }
}
