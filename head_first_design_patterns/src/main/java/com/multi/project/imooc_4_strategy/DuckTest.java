package com.multi.project.imooc_4_strategy;

/**
 * Created by Wuxiang on 2018/4/7
 */
public class DuckTest {
    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
        System.out.println("************************");
        Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new YellowDuck();
        duck = new SpaceDuck();

        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("************************");
        System.out.println("测试完毕");
    }
}
