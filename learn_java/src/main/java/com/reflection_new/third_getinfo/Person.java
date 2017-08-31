package com.reflection_new.third_getinfo;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class Person implements China{
    private String userName;
    private String passWord;

    //构造方法
    public Person(){}
    public Person(String userName) {
        this.userName = userName;
    }
    public Person(String userName, String passWord) {
        this(userName);//调用一个参数的构造方法
        this.passWord = passWord;
    }

    //父类方法
    public void getBasicInfo() {
        System.out.println("国籍："+NATIONL+"，姓名："+NAME);
    }
    public String setBasicInfo(String userName, String pwd) {
        return "用户名："+userName+",密码："+pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}