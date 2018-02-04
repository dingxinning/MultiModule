package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Model Duck !");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackCommon();
    }
}
