package com.spring.bean;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Message {
    private String message;

//    public String getMessage() {
//        return message;
//    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void print(){
        System.out.println("Message:"+message);
    }
}
