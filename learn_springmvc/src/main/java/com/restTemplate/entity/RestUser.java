package com.restTemplate.entity;

/**
 * Created by Wuxiang on 2017/8/31.
 */
public class RestUser {

    private int id;
    private int age;
    private String name;
    private String address;
    private String hobay;

    public RestUser() {
    }

    public RestUser(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public RestUser(int id, int age, String name, String address, String hobay) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.hobay = hobay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobay() {
        return hobay;
    }

    public void setHobay(String hobay) {
        this.hobay = hobay;
    }

    @Override
    public String toString() {
        return "RestUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", hobay='" + hobay + '\'' +
                '}';
    }
}
