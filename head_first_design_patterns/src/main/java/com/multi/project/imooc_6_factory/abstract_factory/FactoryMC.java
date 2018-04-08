package com.multi.project.imooc_6_factory.abstract_factory;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 圣诞系列加工厂
 */
public class FactoryMC implements FactoryPerson {

    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }

}
