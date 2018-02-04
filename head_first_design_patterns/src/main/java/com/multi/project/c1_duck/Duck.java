package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck no swim!!!");
    }
}
