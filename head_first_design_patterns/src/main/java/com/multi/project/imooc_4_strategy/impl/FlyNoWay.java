package com.multi.project.imooc_4_strategy.impl;

import com.multi.project.imooc_4_strategy.FlyingStragety;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class FlyNoWay implements FlyingStragety {

    public void performFly() {
        System.out.println("我不会飞行！");
    }

}
