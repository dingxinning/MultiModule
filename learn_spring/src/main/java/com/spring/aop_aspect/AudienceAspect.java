package com.spring.aop_aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/4/1.
 * 观众类  使用@Aspect注解
 */
@Component
@Aspect
public class AudienceAspect {

    @Pointcut("execution(* com.spring.aop_aspect.Performance.perform(..)) ")
    public void myPerform() {

    }

    @Before("myPerform()")
    public void silenceCellPhones() {
        System.out.println("Log: Silencing cell phones.");
    }

    @Before("execution(* com.spring.aop_aspect.Performance.perform(int)) && args(peopleNum) ")
    public void countNum(int peopleNum) {
        System.out.println("Log: The Number of people when start:"+peopleNum);
    }

    @After("myPerform()")
    public void taskSeats() {
        System.out.println("Log: Perform over! ClAP,ClAP,ClAP.");
    }

    @AfterReturning(returning = "peopleNum", pointcut = "myPerform()")
    public void applause(int peopleNum) {
        System.out.println("Log: The Number of people total perform:"+peopleNum);
    }

    @AfterThrowing("myPerform()")
    public void demandRefund() {
        System.out.println("Log: Perform is failed!!!");
    }

//    环绕通知，将所编写的逻辑被通知的目标方法完全包装起来
    @Around("myPerform()")
    public Object watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("2 Silencing cell phones.");
            System.out.println("2 Taking seats.");
            joinPoint.proceed();
            System.out.println("2 CLAP,CLAP,CLAP,CLAP.");
        } catch (Throwable throwable) {
            System.out.println("2 Demanding a refund.");
        }
        return null;
    }
}
