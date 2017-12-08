package com.java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

import static com.java8.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.1 筛选和切片
 */
public class StreamFiltering {
    public static void main(String[] args) {

        // filter 接受一个谓词(返回布尔值的函数)作为参数，返回符合的流
        List<Dish> vegetarianMenu =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());

        vegetarianMenu.forEach(data->{
            System.out.print(data+", ");
        });
        System.out.println();

        // distinct  返回的元素各不相同
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // limit(n) 返回一个不超过指定长度的流
        List<Dish> dishesLimit3 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .limit(3)
                        .collect(toList());

        dishesLimit3.forEach(data->{
            System.out.print(data+", ");
        });
        System.out.println();

        // skip(n)  返回一个扔掉前n个元素的流
        List<Dish> dishesSkip2 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(toList());

        dishesSkip2.forEach(data->{
            System.out.print(data+", ");
        });
        System.out.println();
    }
}
