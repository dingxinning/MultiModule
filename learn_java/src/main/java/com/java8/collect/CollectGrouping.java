package com.java8.collect;

import java.util.*;

import static java.util.stream.Collectors.*;
import static com.java8.collect.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 *
 * Java8 In Action 第六章 用流收集数据
 * 6.3 分组
 */
public class CollectGrouping {
    public static void main(String[] args) {
        System.out.println("Dishes grouped by type: " + groupDishesByType());
        System.out.println("Dishes grouped by caloric level: " + groupDishesByCaloricLevel());
        System.out.println("Dishes grouped by type and caloric level: " + groupDishedByTypeAndCaloricLevel());
        System.out.println("Count dishes in groups: " + countDishesInGroups());
        System.out.println("Most caloric dishes by type: " + mostCaloricDishesByType());
        System.out.println("Most caloric dishes by type: " + mostCaloricDishesByTypeWithoutOprionals());
        System.out.println("Sum calories by type: " + sumCaloriesByType());
        System.out.println("Caloric levels by type: " + caloricLevelsByType());
    }

    // Collectors.groupingBy  分组
    private static Map<Dish.Type, List<Dish>> groupDishesByType() {
        return menu.stream().collect(groupingBy(Dish::getType));
    }

    // 自定义 分类函数
    private static Map<CaloricLevel, List<Dish>> groupDishesByCaloricLevel() {
        return menu.stream().collect(
                groupingBy(CollectGrouping::commonClassificationFunction));
    }

    // 多级分组
    private static Map<Dish.Type, Map<CaloricLevel, List<Dish>>> groupDishedByTypeAndCaloricLevel() {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        groupingBy(CollectGrouping::commonClassificationFunction)
                )
        );
    }

    // 得到分组后各组的个数
    private static Map<Dish.Type, Long> countDishesInGroups() {
        return menu.stream().collect(groupingBy(Dish::getType, counting()));
    }

    // 得到 各个分组 中的最大者  两种方法
    private static Map<Dish.Type, Optional<Dish>> mostCaloricDishesByType() {
//        return menu.stream().collect(
//                groupingBy(Dish::getType,
//                        reducing((Dish d1, Dish d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)));
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        maxBy(Comparator.comparingInt(Dish::getCalories))));
    }

    // Collectors.collectingAndThen  将收集器返回的结果转换为另外一种类型
    private static Map<Dish.Type, Dish> mostCaloricDishesByTypeWithoutOprionals() {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        collectingAndThen(
                                reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2),
                                Optional::get)));
    }

    // groupingBy & summingInt 联合： 分组后，求各组的和
    private static Map<Dish.Type, Integer> sumCaloriesByType() {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        summingInt(Dish::getCalories)));
    }

    // groupingBy & mapping 联合 ： 分组后， 各组元素存入set中
    private static Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType() {
        return menu.stream().collect(
                groupingBy(Dish::getType,
                        mapping(CollectGrouping::commonClassificationFunction, toSet() )));
    }

    private static CaloricLevel commonClassificationFunction(Dish dish) {
        if (dish.getCalories() <= 400) return CaloricLevel.DIET;
        else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
        else return CaloricLevel.FAT;
    }
}
