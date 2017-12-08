package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by Wuxiang on 2017/12/8.
 *
 * Java8 In Action 第三章 Lambda表达式
 */
public class Sorting {
    public static void main(String[] args) {
        // 1 实现 interface Comparator<T>
        List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(
                new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red")));
        inventory.sort(new AppleComparator());
        System.out.println(inventory);

        inventory.set(1, new Apple(30, "green"));

        // 2 重写 Comparator 接口
        inventory.sort(new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2){
                return a1.getWeight().compareTo(a2.getWeight());
            }});
        System.out.println(inventory);

        inventory.set(1, new Apple(20, "red"));

        // 3 使用 lambda表达式
        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);

        inventory.set(1, new Apple(10, "red"));

        // 4 更加简介的方式
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);
    }
}
