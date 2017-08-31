package com.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Application {
    public static void main(String[]args){
        //2种装配Bean的容器
        //第一种 BeanFactory (基本的Ioc支持)
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("config/MyDIConfig.xml");
        Message message= (Message) beanFactory.getBean("messageBean");
        message.print();

        //第二种 ApplicationContext  (在BeanFactory上有了拓展)
        ApplicationContext context=new ClassPathXmlApplicationContext("config/MyDIConfig.xml");
        Fruit fruit=(Fruit) context.getBean("fruitBean");
        System.out.println(fruit.toString());
    }
}
