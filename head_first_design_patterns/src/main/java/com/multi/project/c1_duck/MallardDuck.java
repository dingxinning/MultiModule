package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackCommon();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck!");
    }
}
