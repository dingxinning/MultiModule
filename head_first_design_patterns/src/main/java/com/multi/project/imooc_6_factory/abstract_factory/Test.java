package com.multi.project.imooc_6_factory.abstract_factory;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 抽象工厂模式
 *
 * 工厂模式违背了闭包原则
 * 抽象工厂模式通过创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class Test {
    public static void main(String[] args) {

        // 圣诞系列的女孩子
        FactoryPerson factoryMC = new FactoryMC();
        Girl girl = factoryMC.getGirl();
        girl.drawWomen();

        // 新年系列的男孩子
        FactoryPerson factoryHN = new FactoryHN();
        Boy boy = factoryHN.getBoy();
        boy.drawMan();
    }
}
