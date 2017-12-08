package com.java8.collect;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static com.java8.collect.Dish.menu;

/**
 * Created by Wuxiang on 2017/12/8.
 *
 * Java8 In Action 第六章 用流收集数据
 * 6.4 分区: 分组的特殊情况
 */
public class CollectPartitioning {

    public static void main(String[] args) {
        System.out.println("Dishes partitioned by vegetarian: " + partitionByVegeterian());
        System.out.println("Vegetarian Dishes by type: " + vegetarianDishesByType());
        System.out.println("Most caloric dishes by vegetarian: " + mostCaloricPartitionedByVegetarian());
    }

    // Collectors.partitioningBy  Map的键是boolean类型，元素被分为两组
    private static Map<Boolean, List<Dish>> partitionByVegeterian() {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian));
    }

    // 分区+分组 ，形成二级Map
    private static Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType() {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
    }

    // 分区 -> 分组 -> 取各组最大值 -> 转换类型
    private static Object mostCaloricPartitionedByVegetarian() {
        return menu.stream().collect(
                partitioningBy(Dish::isVegetarian,
                        collectingAndThen(
                                maxBy(comparingInt(Dish::getCalories)),
                                Optional::get)));
    }
}
