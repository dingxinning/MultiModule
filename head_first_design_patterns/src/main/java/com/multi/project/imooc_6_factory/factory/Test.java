package com.multi.project.imooc_6_factory.factory;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 工厂模式
 *
 * 常见应用  JDBC、Spring BeanFactory
 *
 * 工厂模式与抽象工厂模式对比
 *
 * 1. 工厂模式一种极端情况的抽象工厂模式
 * 2. 工厂模式用来创建一个产品的等级体系，抽象工厂模式用来创建多个产品的等级体系
 * 3. 工厂模式只有一个抽象产品类，抽象工厂模式有多个抽象产品类
 */
public class Test {
    public static void main(String[] args) {

        // 一般情况，直接 new需要的对象
        HairInterface left = new LeftHair();
		left.draw();

		// 使用工厂模式

        // 1. 代码写死 if else （不好维护）
        HairFactory factory = new HairFactory();
        HairInterface right =  factory.getHair("right");
        right.draw();

        // 2. 传入类的名称
//		HairInterface left2 = factory.getHairByClass("com.multi.project.imooc_6_factory.factory.LeftHair");
		// 可以尝试简化
        HairInterface left2 = factory.getHairByClass(LeftHair.class.getName());
		left2.draw();

		// 3. 读取配置文件的配置，根据映射关系创建（有问题，读不到）
//		HairInterface in = factory.getHairByClassKey("in");
//		in.draw();

    }
}
