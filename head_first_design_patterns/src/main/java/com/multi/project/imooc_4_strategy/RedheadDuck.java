package com.multi.project.imooc_4_strategy;

import com.multi.project.imooc_4_strategy.impl.FlyWithWin;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }

}
