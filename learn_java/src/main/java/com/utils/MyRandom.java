package com.utils;

import java.util.Random;

/**
 * Created by Wuxiang on 2017/4/1.
 */
public class MyRandom {
    public static void main(String[] args) {
        //Math.random() 随机生成0-1的小数

        //生成1-10的随机数
        for (int i = 0; i < 100; i++) {
            int temp = (int) (Math.random() * 10) + 1;
            System.out.println(temp);
        }
        System.out.println("----------------------------");


        Random r=new Random();
        //生成 -99到99 的随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt() % 100);
        }
        System.out.println("----------------------------");

        //生成 0到99 的随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.abs(r.nextInt()) % 100);
        }
        System.out.println("----------------------------");

        //生成boolean随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextBoolean());
        }
        System.out.println("----------------------------");

        //生成double随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextDouble());
        }
        System.out.println("----------------------------");

    }
}
