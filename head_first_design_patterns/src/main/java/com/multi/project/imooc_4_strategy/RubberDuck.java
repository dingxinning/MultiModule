package com.multi.project.imooc_4_strategy;

import com.multi.project.imooc_4_strategy.impl.FlyNoWay;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }

    @Override
    public void quack(){
        System.out.println("嘎~嘎~嘎~");
    }

}