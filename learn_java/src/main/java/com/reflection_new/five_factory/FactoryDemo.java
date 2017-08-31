package com.reflection_new.five_factory;

import com.reflection_new.five_factory.entity.Fruit;

/**
 * Created by Wuxiang on 2017/8/25.
 *
 * 可以 在设计模式中， 与一般的工厂模式 对比
 */
public class FactoryDemo {
    public static void main(String[] args) throws Exception {
        //使用反射进行改进
        Fruit f2 = FactoryByReflect
                .getInstance("com.reflection_new.five_factory.entity.Pear");
        f2.eat();
    }
}
