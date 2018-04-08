package com.multi.project.imooc_5_proxy.proxy;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 静态代理 之 组合方式
 */
public class CarComb implements Moveable {

    public CarComb(Car car) {
        super();
        this.car = car;
    }

    private Car car;

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");

        car.move();

        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }


}
