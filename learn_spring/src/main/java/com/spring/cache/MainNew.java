package com.spring.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wuxiang on 2017/1/2.
 */
public class MainNew {
    public static void main(String[] args) {
        // 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("config/Spring-cache-anno.xml");
        AccountService s = (AccountService) context.getBean("accountServiceBean");
        // 第一次查询，应该走数据库
        System.out.print("first query...");
        s.getAccountByName("somebody");
        // 第二次查询，应该不查数据库，直接返回缓存的值
        System.out.print("second query...");
        s.getAccountByName("somebody");
        System.out.println();

        System.out.println("start testing clear cache...");
        // 更新某个记录的缓存，首先构造两个账号记录，然后记录到缓存中
        Account account1 = s.getAccountByName("aaa");
        s.getAccountByName("bbb");

        // 开始更新其中一个
        account1.setId(1212);
        s.deleteAccount(account1);

        s.getAccountByName("aaa");// 因为被更新了，所以会查询数据库
        s.getAccountByName("aaa");// 再次查询，应该走缓存
        s.getAccountByName("bbb");// 没有更新过，应该走缓存
        s.reload();// 清空所有缓存
        s.getAccountByName("aaa");// 应该会查询数据库
        s.getAccountByName("aaa");// 应该走缓存
        s.getAccountByName("bbb");// 应该会查询数据库
        s.getAccountByName("bbb");// 应该走缓存

        s.getAccountByNameLess("www.51zxw.com");// 长度大于 4，不会被缓存
        s.getAccountByNameLess("sbd");// 长度小于 4，会被缓存
        s.getAccountByNameLess("www.51zxw.com");// 还是查询数据库
        s.getAccountByNameLess("sbd");// 会从缓存返回

        s.getAccount("somebody", "123456", true);// 应该查询数据库
        s.getAccount("somebody", "123456", true);// 应该走缓存
        s.getAccount("somebody", "123456", false);// 应该走缓存
        s.getAccount("somebody", "654321", true);// 应该查询数据库
        s.getAccount("somebody", "654321", true);// 应该走缓存

        Account account = s.getAccountByName("qqqqqqqqq");
        account.setPassword("123");
        s.updateAccount(account);
        account.setPassword("321");
        s.updateAccount(account);
        account = s.getAccountByName("qqqqqqqqq");
        System.out.println(account.getPassword());
    }
}
