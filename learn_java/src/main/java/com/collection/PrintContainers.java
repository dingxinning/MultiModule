package com.collection;

import java.util.*;

/**
 * Created by Wuxiang on 2017/10/14.
 * 打印容器，并观察存储顺序
 */
public class PrintContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rrrr");
        collection.add("cccc");
        collection.add("dddd");
        collection.add("dddd");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rrrr", "Fulay");
        map.put("cccc", "Dasg");
        map.put("dddd", "Bosco");
        map.put("dddd", "Bosco");
        return map;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList 按照被插入的顺序保存："+fill(new ArrayList<>()));
        System.out.println("LinkedList 按照被插入的顺序保存："+fill(new LinkedList<>()));
        System.out.println();
        System.out.println("HashSet 快速查找，无顺序："+fill(new HashSet<>()));
        System.out.println("TreeSet 按照结果升序保存："+fill(new TreeSet<>()));
        System.out.println("LinkedHashSet 按照被添加的顺序保存："+fill(new LinkedHashSet<>()));
        System.out.println();
        System.out.println("HashMap 快速查找，无顺序："+fill(new HashMap<>()));
        System.out.println("TreeMap 按照结果升序保存："+fill(new TreeMap<>()));
        System.out.println("LinkedHashMap 按照被添加的顺序保存："+fill(new LinkedHashMap<>()));
    }
}
