package com.thinking_in_java.chapter16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Wuxiang on 2018/1/28
 *
 * 16.7  Arrays 常用的功能
 */
public class ArraysCommon {

    public static void main(String[] args) {

        // Arrays.asList()  接受序列转为list容器
        List<String> a = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(a);

        // Arrays.fill() 用一个值填充数组的所有位置
        // Arrays.toString() 产生数组的String表示
        boolean[] b = new boolean[5];
        Arrays.fill(b, true);
        System.out.println(Arrays.toString(b));

        // System.arrayCopy()  复制数组
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println(Arrays.toString(j));

        // Arrays.equals() 比较整个数组 （包括元素个数，对应位置的元素也要相等）
        System.out.println(Arrays.equals(i, j));

        // Arrays.sort() 数组元素排序
        int[] d = {9, 1, 6, 3, 8, 2, 5};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        // 自定义排序
        // 当前对象 < 参数  返回负数
        // 相等  返回 0
        // 当前对象 > 参数  返回正数
    }
}
