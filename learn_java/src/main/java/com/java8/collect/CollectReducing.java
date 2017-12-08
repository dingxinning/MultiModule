package com.java8.collect;

import static com.java8.collect.Dish.menu;
import static java.util.stream.Collectors.reducing;

/**
 * Created by Wuxiang on 2017/12/8.
 *
 * Java8 In Action 第六章 用流收集数据
 * 6.2 归约和汇总  2 广义
 *
 * Collectors.reducing  所有特殊情况的一般化
 */
public class CollectReducing {

    public static void main(String[] args) {
        // 利用 Collectors.reducing 求和
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithMethodReference());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesWithoutCollectors());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesUsingSum());
    }

    /*
     * Collectors.reducing 的完整参数
     * 1. U identity,   // 归约操作的初始值
     * 2. Function<? super T, ? extends U> mapper,  // 转换函数
     * 3. BinaryOperator<U> op    // 操作
     */
    private static int calculateTotalCalories() {
        return menu.stream().collect(reducing(0, Dish::getCalories, (Integer i, Integer j) -> i + j));
    }

    // 使用 累加函数 Integer::sum  -> 代替 Lambda表达式
    private static int calculateTotalCaloriesWithMethodReference() {
        return menu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));
    }

    // 或者 利用 stream的reduce()操作，最后 得到一个 Optional<Integer> ，利用get()提取值
    private static int calculateTotalCaloriesWithoutCollectors() {
        return menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
    }

    // 或者 更简洁的写法
    private static int calculateTotalCaloriesUsingSum() {
        return menu.stream().mapToInt(Dish::getCalories).sum();
    }
}
