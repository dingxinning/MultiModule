package com.collection;

import java.util.*;

/**
 * Created by Wuxiang on 2017/10/15.
 * 使用底层容器，输出 list、set、map
 */
public class CollectionTest {

    public static void display(Iterator<String> iterator) {
        while ((iterator.hasNext())) {
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
    }

    public static void display(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        Set<String> set = new HashSet<>(list);
        Map<Integer, String> map = new LinkedHashMap<>();
        String[] names = "aa,bb,cc,dd,ee".split(",");
        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }
        display(list);
        display(set);
        display(list.iterator());
        display(set.iterator());
        System.out.println(map);
        System.out.println(map.entrySet()); // return List，key & value
        System.out.println(map.keySet()); // return List，key
        System.out.println(map.values()); // return List，value
        display(map.values());
        display(map.values().iterator());
    }
}
