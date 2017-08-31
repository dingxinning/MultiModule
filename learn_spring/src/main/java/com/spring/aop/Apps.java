package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wuxiang on 2017/4/1.
 */
public class Apps {
    public static void main(String[] args) {
        //测试aop
        //Knight运行，Minstrel声明为切面
        ApplicationContext newContext = new ClassPathXmlApplicationContext("config/MyAOPConfig.xml");
//        ApplicationContext newContext = new ClassPathXmlApplicationContext("config/MyAOPAutoConfig.xml");
        Knight knight = (Knight) newContext.getBean("knight");
        knight.query();
    }
}
