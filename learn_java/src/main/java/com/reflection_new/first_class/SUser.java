package com.reflection_new.first_class;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class SUser {
    private String userName;
    private String passWord;

    public SUser(){//无参构造方法
    }
    public SUser(String userName) {
        this.userName = userName;
    }
    public SUser(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
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

    @Override
    public String toString() {
        return "SUser{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
