package com.multi.project.imooc_4_strategy;

import com.multi.project.imooc_4_strategy.impl.FlyWithWin;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class MallardDuck extends Duck {


    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }

}
