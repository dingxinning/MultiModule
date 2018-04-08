package com.multi.project.imooc_5_proxy.jdk_proxy;

import java.util.Random;

/**
 * Created by Wuxiang on 2018/4/8
 */
public class Car implements Moveable {

    @Override
    public void move() {
        //实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
