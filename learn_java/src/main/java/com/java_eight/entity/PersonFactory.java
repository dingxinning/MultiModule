package com.java_eight.entity;

/**
 * Created by Wuxiang on 2017/12/7.
 * 建造工厂
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
