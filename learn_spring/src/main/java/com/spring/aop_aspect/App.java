package com.spring.aop_aspect;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wuxiang on 2017/4/1.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/MyAOPConfig.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("config/MyAOPAutoConfig.xml");
        Performance performance = (Performance) context.getBean("perform");
        int start = (int) (Math.random() * 10) + 1;
        performance.perform(start);
    }
}
