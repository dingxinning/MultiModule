package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
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
