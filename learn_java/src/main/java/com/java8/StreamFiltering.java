package com.java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

import static com.java8.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 */
public class StreamFiltering {
    public static void main(String[] args) {
        // Filtering with predicate
        List<Dish> vegetarianMenu =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());

        vegetarianMenu.forEach(data->{
            System.out.print(data+", ");
        });
        System.out.println();

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .limit(3)
                        .collect(toList());

        dishesLimit3.forEach(data->{
            System.out.print(data+", ");
        });
        System.out.println();

        // Skipping elements
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
