package com.java8;

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

        Optional<Dish> dish = findVegetarianDish();
        dish.ifPresent(d -> System.out.println(d.getName()));

        Optional<Dish> dishOptional = findCalor100Dish();
        dishOptional.ifPresent(d-> System.out.println(d.getCalories()));
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

    // findAny 返回当前流中的任意元素
    // Optional 代表一个值存在或不存在 （findAny 可能返回null）
    // Optional.ifPresent 如果存在才会输出
    private static Optional<Dish> findVegetarianDish() {
        return menu.stream().filter(Dish::isVegetarian).findAny();
    }

    private static Optional<Dish> findCalor100Dish() {
        return menu.stream().filter(data-> data.getCalories() == 100).findAny();
    }
}
