package com.spring.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by Wuxiang on 2017/1/2.
 */
public class AccountService {
    /**
     * 当调用这个方法的时候，会从一个名叫 accountCache 的缓存中查询，
     * 如果没有，则执行实际的方法（即查询数据库），并将执行的结果存入缓存中，否则返回缓存中的对象。
     * @param userName
     * @return
     */
    @Cacheable(value="accountCache")// 使用了一个缓存名叫 accountCache
    public Account getAccountByName(String userName) {
        System.out.println("real querying db..."+userName);
        return new Account(userName);
    }
    //condition =账号名称的长度小于等于 4 的情况下，才做缓存
    @Cacheable(value="accountCache",condition="#userName.length() <= 4")// 使用了一个缓存名叫 accountCache
    public Account getAccountByNameLess(String userName) {
        System.out.println("real querying db..."+userName);
        return new Account(userName);
    }
    //测试 基于 proxy 的 spring aop 带来的内部调用问题
    public Account getAccountByName2(String userName) {
        return this.getAccountByName(userName);
    }

    /**
     * 有多个参数，支持组合key
     */
    @Cacheable(value="accountCache",key="#userName.concat(#password)")
    public Account getAccount(String userName,String password,boolean sendLog) {
        System.out.println("---real querying db---"+userName+":"+password+":"+sendLog);
        //因为方法只用到了name和password两个参数， loolean 对缓存没有影响
        return new Account(userName,password);
    }

    /**
     * 根据name清除单个缓存
     * @param account
     */
    @CacheEvict(value="accountCache",key="#account.getName()")
    public void deleteAccount(Account account) {
        System.out.println("-----清除"+account.getName()+"的缓存-----");
    }

    // 更新 accountCache 缓存
    @CachePut(value="accountCache",key="#account.getName()")
    public Account updateAccount(Account account) {
        System.out.println("real updating db..."+account.getName());
        return account;
    }

    //清空 accountCache 缓存
    //设置beforeInvocation为true，可以确保缓存被清空
    @CacheEvict(value="accountCache",allEntries=true,beforeInvocation = true)
    public void reload() {
        System.out.println("-----清空所有缓存-----");
    }
}
