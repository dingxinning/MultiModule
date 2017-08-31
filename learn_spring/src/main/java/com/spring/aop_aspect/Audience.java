package com.spring.aop_aspect;

/**
 * Created by Wuxiang on 2017/4/1.
 * xml配置   观众类
 */
public class Audience {
    public void silenceCellPhones() {
        System.out.println("Log: Silencing cell phones.");
    }

    public void countNum(int peopleNum) {
        System.out.println("Log: The Number of people when start:"+peopleNum);
    }

    public void taskSeats() {
        System.out.println("Log: Perform over! ClAP,ClAP,ClAP.");
    }

    public void applause(int peopleNum) {
        System.out.println("Log: The Number of people total perform:"+peopleNum);
    }

    public void demandRefund() {
        System.out.println("Log: Perform is failed!!!");
    }
}
