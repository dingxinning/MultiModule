package com.multi.project.c1_duck;

/**
 * Created by Wuxiang on 2018/2/4
 */
public class QuackSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
