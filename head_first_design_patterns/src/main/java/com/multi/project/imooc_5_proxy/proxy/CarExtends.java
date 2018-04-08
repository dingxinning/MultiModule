package com.multi.project.imooc_5_proxy.proxy;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 静态代理 之 继承方式
 */
public class CarExtends extends Car {

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");

        super.move();

        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }

}
