package com.multi.project.imooc_5_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 代理模式 之 使用 JDK的反射进行动态代理
 *
 * 代理类需要实现 InvocationHandler接口
 */
public class Test {

    /**
     * JDK动态代理测试类
     */
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();

        /* 调用 Proxy的静态方法，创建一个代理类
         * loader  类加载器
         * interfaces  实现接口
         * h InvocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), h);

        // 通过代理调用方法
        m.move();
    }

}