package com.multi.project.imooc_2_template;

/**
 * Created by Wuxiang on 2018/4/7
 *
 * 具体子类，提供了咖啡制备的具体实现
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("2.用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("4.加入糖和牛奶");
    }

}

