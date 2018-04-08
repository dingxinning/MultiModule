package com.multi.project.imooc_5_proxy.cglib_proxy;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 代理模式 之 使用 cglib 进行动态代理
 */
public class Test {

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
    }
}
