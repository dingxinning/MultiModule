package com.collection;

import java.util.*;

/**
 * Created by Wuxiang on 2017/1/25.
 * HashSet 使用 散列函数
 * TreeSet 将元素存储在 红黑树 中
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        String s1 = new String("hello");
        String s2 = s1;
        String s3 = new String("world");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());  //大小为2   ，去掉重复的元素

        // 比较 HashSet 和 TreeSet的区别，但输出已经无法重现书中的场景
        Random random = new Random(47);
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            integerSet.add(random.nextInt(30));
        }
        System.out.println(integerSet);

        Set<Integer> integerSet1 = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            integerSet1.add(random.nextInt(30));
        }
        System.out.println(integerSet1);

        // 书中Demo ：展示 Set 常用的功能方法
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1,
                "A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println("H: " + set1.contains("H"));
        System.out.println("N: " + set1.contains("N"));
        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2, "H I J K L".split(" "));
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1: " + set1);
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set2 removed from set1: " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        System.out.println("'X Y Z' added to set1: " + set1);
    }
}
