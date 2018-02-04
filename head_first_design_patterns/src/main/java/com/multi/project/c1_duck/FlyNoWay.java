package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
