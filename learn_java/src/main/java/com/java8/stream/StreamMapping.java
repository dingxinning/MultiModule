package com.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static com.java8.stream.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.2 映射
 */
public class StreamMapping {
    public static void main(String[] args) {

        // map 是映射，而不是修改
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames);

        // map
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);

        // flatMap  将流中的每一个值都变为另一个流
        words.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .forEach(System.out::println);

        // flatMap
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(6,7,8);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap((Integer i) -> numbers2.stream()
                                .map((Integer j) -> new int[]{i, j})
                        )
                        .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                        .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));


        // 测试：数组中，根据对象的两个属性转换map
        List<Map<String, String>> test1 = new ArrayList<>();
        Map<String, String> m1 = new HashMap<>();
        m1.put("code", "1");
        m1.put("name", "1");
        m1.put("qty", "1");
        m1.put("unit", "粒");
        Map<String, String> m2 = new HashMap<>();
        m2.put("code", "1");
        m2.put("name", "1");
        m2.put("qty", "3");
        m2.put("unit", "盒");
        Map<String, String> m3 = new HashMap<>();
        m3.put("code", "2");
        m3.put("name", "2");
        m3.put("qty", "5");
        m3.put("unit", "片");
        Map<String, String> m4 = new HashMap<>();
        m4.put("code", "2");
        m4.put("name", "2");
        m4.put("qty", "1");
        m4.put("unit", "片");
        test1.add(m1);
        test1.add(m2);
        test1.add(m3);
        test1.add(m4);
        System.out.println(test1);

        Map map = test1.stream().collect(Collectors.toMap(
                item -> item.get("code").toString() + item.get("unit").toString(),
                x -> x,
                (left, right) -> {
                    left.put("qty", left.get("qty")+right.get("qty") );
                    return left;
                }
        ));
        System.out.println(map);
        System.out.println(map.values().stream().collect(Collectors.toList()));

    }
}
