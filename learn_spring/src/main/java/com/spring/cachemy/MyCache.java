package com.spring.cachemy;

/**
 * Created by Wuxiang on 2017/1/4.
 */

import com.spring.cache.Account;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;

import java.util.HashMap;
import java.util.Map;

public class MyCache implements Cache {
    private String name;
    private Map<String, Account> store = new HashMap<String, Account>();
    ;

    public MyCache() {
    }

    public MyCache(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getNativeCache() {
        return store;
    }

    @Override
    public ValueWrapper get(Object key) {
        ValueWrapper result = null;
        Account thevalue = store.get(key);
        if (thevalue != null) {
            thevalue.setPassword("from mycache:" + name);
            result = new SimpleValueWrapper(thevalue);
        }
        return result;
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        Account thevalue = (Account) value;
        store.put((String) key, thevalue);
    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }

    @Override
    public void evict(Object key) {
    }

    @Override
    public void clear() {
    }
}