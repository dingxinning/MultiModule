package com.java8.collect;

import java.util.*;
import java.util.function.*;

import static java.util.stream.Collectors.*;
import static com.java8.collect.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 *
 * Java8 In Action 第六章 用流收集数据
 * 6.2 归约和汇总  1 狭义
 */
public class CollectSummarizing {
    public static void main(String[] args) {
        System.out.println("Nr. of dishes: " + howManyDishes());
        System.out.println("The most caloric dish is: " + findMostCaloricDish());
        System.out.println("The most caloric dish is: " + findMostCaloricDishUsingComparator());
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Average calories in menu: " + calculateAverageCalories());
        System.out.println("Menu statistics: " + calculateMenuStatistics());
        System.out.println("Short menu: " + getShortMenu());
        System.out.println("Short menu comma separated: " + getShortMenuCommaSeparated());
    }

    // Collectors.counting 计算流中元素的个数
    private static long howManyDishes() {
        return menu.stream().collect(counting());
    }

    // Collectors.reducing 求最大值 (单参数)
    private static Dish findMostCaloricDish() {
        return menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)).get();
    }

    // Collectors.maxBy 查找 流中的最大值
    // Collectors.minBy 查找 流中的最小值
    private static Dish findMostCaloricDishUsingComparator() {
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        BinaryOperator<Dish> moreCaloricOf = BinaryOperator.minBy(dishCaloriesComparator);
        return menu.stream().collect(reducing(moreCaloricOf)).get();
    }

    // Collectors.summingInt 汇总 求和  (summingDouble & summingLong 效果完全相同)
    private static int calculateTotalCalories() {
        return menu.stream().collect(summingInt(Dish::getCalories));
    }

    // Collectors.averagingInt 汇总 求平均
    private static Double calculateAverageCalories() {
        return menu.stream().collect(averagingInt(Dish::getCalories));
    }

    // Collectors.summarizingInt 所有的汇总信息 包含 count=9, sum=4300, min=120, average=477.777778, max=800
    private static IntSummaryStatistics calculateMenuStatistics() {
        return menu.stream().collect(summarizingInt(Dish::getCalories));
    }

    // Collectors.joining 连接字符串
    private static String getShortMenu() {
        return menu.stream().map(Dish::getName).collect(joining());
    }

    private static String getShortMenuCommaSeparated() {
        return menu.stream().map(Dish::getName).collect(joining(", "));
    }
}
