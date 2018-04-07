package com.multi.project.imooc_4_strategy;

import com.multi.project.imooc_4_strategy.impl.FlyWithRocket;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class SpaceDuck extends Duck {

    public SpaceDuck() {
        super();
        System.out.println("init child duck");
        super.setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }

    @Override
    public void quack(){
        System.out.println("我通过无线电与你通信");
    }

}
