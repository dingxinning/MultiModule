package com.java_eight.entity;

/**
 * Created by Wuxiang on 2017/12/7.
 */


public class Person {
    public String firstName;
    public String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("+_+ "+this.firstName+"   "+this.lastName);
    }
}
