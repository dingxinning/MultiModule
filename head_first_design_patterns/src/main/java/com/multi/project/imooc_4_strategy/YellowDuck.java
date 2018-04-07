package com.multi.project.imooc_4_strategy;

import com.multi.project.imooc_4_strategy.impl.FlyNoWay;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class YellowDuck extends Duck {

    public YellowDuck() {
        super();
        System.out.println("init child duck");
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
}
