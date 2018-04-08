package com.multi.project.imooc_6_factory.abstract_factory;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 新年系列加工厂
 */
public class FactoryHN implements FactoryPerson{
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
