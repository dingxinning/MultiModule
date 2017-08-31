package com.spring.aop;


/**
 * Created by Wuxiang on 2017/3/31.
 * 吟游诗人类
 * 利用AOP，分别在Knight的Query方法前后自动调用下面的两个方法
 * 第一种方法：使用xml配置
 */
public class Minstrel {
    public void singBefore() {
        System.out.println("Minstrel sing before");
    }

    public void singAfter() {
        System.out.println("Minstrel sing after!");
    }

    public void singReturn() {
        System.out.println("Minstrel sing return!");
    }
}
