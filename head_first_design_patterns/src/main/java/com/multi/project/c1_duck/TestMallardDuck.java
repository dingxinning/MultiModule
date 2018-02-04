package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 *
 * 创建一个实例，会飞，会叫
 */
public class TestMallardDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
