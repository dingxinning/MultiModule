package com.multi.project.imooc_5_proxy.proxy;

/**
 * Created by Wuxiang on 2018/4/8
 */
public class CarLogProxy implements Moveable {

    public CarLogProxy(Moveable m) {
        super();
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        System.out.println("日志开始....");
        m.move();
        System.out.println("日志结束....");
    }

}
