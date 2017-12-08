package com.java8.stream;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.java8.stream.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.6 数值流
 */
public class NumericStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        Arrays.stream(numbers.toArray()).forEach(System.out::print);
        System.out.println();


        // 映射到数值流的方法  1. mapToInt 2. mapToDouble 3. mapToLong
        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("Number of calories:" + calories);

        // 转换回对象流  boxed
        Stream<Integer> stream = menu.stream()
                .mapToInt(Dish::getCalories)
                .boxed();
        stream.reduce(Integer::sum).ifPresent(s -> System.out.println("Number of calories:" + s));


        // 默认值 OptionalInt
        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        int max = maxCalories.orElse(1);  // 没有最大值的话，提供默认值
        System.out.println(max);

        // 数值范围  1.rangeClosed 包含结束值  2. range 不包含结束值
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println("1~100偶数的数量:" + evenNumbers.count());


        // 应用： 勾股数
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a -> IntStream.rangeClosed(a, 100)
                                .filter(b -> isPerfectSquare(a, b)).boxed()
                                .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                        );

        pythagoreanTriples.limit(10).forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }

    // 判断 输入的数字 是否能被开方
    // 即 a方 + b方 能被开根的话，意味着 c 为整数
    private static boolean isPerfectSquare(int a, int b) {
        return Math.sqrt(a * a + b * b) % 1 == 0;
    }
}
