package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 *
 * 创建模型鸭，不会飞，会叫
 * 动态设定行为，使其会飞
 */
public class TestModelDuck {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("给模型鸭加个火箭！");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
