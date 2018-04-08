package com.multi.project.imooc_5_proxy.proxy;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 代理模式 之 静态代理
 *
 * 组合 比 继承更适合代理模式，可以很好地实现代理功能的叠加
 */
public class Test {

    public static void main(String[] args) {
        // 普通
//        Car car = new Car();
//        car.move();

        // 使用继承方式
//        Moveable m = new CarExtends();
//        m.move();

        // 使用组合方式实现
//        Car car = new Car();
//        Moveable m = new CarComb(car);
//        m.move();

        // 测试：使用 组合方式进行功能的叠加
        Car car = new Car();
        CarTimeProxy ctp = new CarTimeProxy(car);
        CarLogProxy clp = new CarLogProxy(ctp);
        clp.move();
    }
}
