package com.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/3/31.
 * 第二种方法：使用注解的形式实现AOP
 * 切面=切点+通知
 */
@Component
@Aspect
public class MinstrelAspect {
    //配置 切点
    @Pointcut("execution(* com.spring.aop.Knight.query(..))")
    public void myPointCut() {

    }

    //各种 通知
    @Before("myPointCut()")
    public void singBefore() {
        System.out.println("Minstrel sing before");
    }

    @After("myPointCut()")
    public void singAfter() {
        System.out.println("Minstrel sing after!");
    }

    @AfterReturning("myPointCut()")
    public void singReturn() {
        System.out.println("Minstrel sing return!");
    }
}
