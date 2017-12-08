package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.java8.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 * Java8 In Action 第五章 使用Stream
 * 5.3 查找和匹配
 */
public class StreamFinding {
    public static void main(String[] args) {
        if (isVegetarianFriendlyMenu()) {
            System.out.println("Vegetarian friendly");
        }

        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        // Optional 代表一个值存在或不存在 （findAny / findFirst 可能返回null）
        // Optional.ifPresent 如果存在才会输出

        // findAny 返回当前流中的任意元素
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));

        // 测试返回null的情况
        findCalor100Dish();

        // findFirst 返回第一个元素
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> optional = someNumbers.stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst();
        optional.ifPresent(System.out::println);

        // 比较： 在并发的情况下，使用 findAny 比 findFirst 的限制更小
    }

    // anyMatch 流中是否有一个元素能匹配给定的谓词
    private static boolean isVegetarianFriendlyMenu() {
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    // allMatch 流中的元素是否都能匹配给定的谓词
    private static boolean isHealthyMenu() {
        return menu.stream().allMatch(d -> d.getCalories() < 1000);
    }

    // noneMatch 确认流中没有任何元素与给定的谓词匹配
    private static boolean isHealthyMenu2() {
        return menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }


    private static void findCalor100Dish() {
        menu.stream()
                .filter(data-> data.getCalories() == 100)
                .findAny()
                .ifPresent(d-> System.out.println(d.getCalories()));
    }
}
