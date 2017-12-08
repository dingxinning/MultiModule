package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.java8.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.4 归约
 */
public class StreamReducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);

        // 元素累加
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        // 元素累乘
        int sum3 = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(sum3);

        // 求最大值
        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        // 求最小值
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        // 实战  求和
        int calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("Number of calories:" + calories);

        // 实战 求数量
        int count = menu.stream().map(dish -> 1).reduce(0, Integer::sum);
        System.out.println("Dish总数：" + count);
        System.out.println("Dish总数：" + menu.stream().count());
    }
}
