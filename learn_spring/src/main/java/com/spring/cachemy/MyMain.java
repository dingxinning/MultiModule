package com.spring.cachemy;

import com.spring.cache.Account;
import com.spring.cache.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wuxiang on 2017/1/4.
 */
public class MyMain {
    public static void main(String[] args) {
        // 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("config/Spring-cache.xml");

        AccountService s = (AccountService) context.getBean("accountServiceBean");

        Account account = s.getAccountByName("someone");
        System.out.println("passwd="+account.getPassword());
        account = s.getAccountByName("someone");
        System.out.println("passwd="+account.getPassword());

        //避免对缓存方法的内部调用，内部调用会使得缓存不起作用
        s.getAccountByName2("someone");
        s.getAccountByName2("someone");
        s.getAccountByName2("someone");
    }
}
