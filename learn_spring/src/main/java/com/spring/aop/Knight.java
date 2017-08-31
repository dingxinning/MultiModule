package com.spring.aop;


import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/3/31.
 * 骑士类
 * 拥有执行任务的方法
 */
@Component("knight")
public class Knight {
    public void query() {
        startTask();
        System.out.println("Knight query task......");
        endTask();
    }

    private void startTask() {
        System.out.println("Start Task!!!");
    }

    private void endTask() {
        System.out.println("End Task!!!");
    }
}
