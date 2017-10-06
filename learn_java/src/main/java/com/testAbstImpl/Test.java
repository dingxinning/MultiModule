package com.testAbstImpl;

/**
 * Created by Wuxiang on 2017/10/6.
 * 测试 当父类方法与接口方法重名的时候，发生了什么
 *
 * 结果：1.当重名后，子类会继承父类的方法，用继承来的方法实现接口的方法
 *      2.子类也可以选择重写该方法，当调用时，先判断子类有没有重写，有则调用，无则调用父类方法
 */
public class Test extends Father implements Jiekou{
    public static void main(String[] args) {
        Test test = new Test();
        test.yxrswx();
    }

    @Override
    public void yxrswx() {
        System.out.println("子类重写方法");
    }
}
