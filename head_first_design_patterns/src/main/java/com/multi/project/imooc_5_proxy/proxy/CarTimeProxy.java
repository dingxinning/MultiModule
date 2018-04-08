package com.multi.project.imooc_5_proxy.proxy;

/**
 * Created by Wuxiang on 2018/4/8
 */
public class CarTimeProxy implements Moveable {

    public CarTimeProxy(Moveable m) {
        super();
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");

        m.move();

        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }

}
