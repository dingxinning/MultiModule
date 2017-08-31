package com.reflection_new.fourth_setget;

import java.lang.reflect.Method;

/**
 * Created by Wuxiang on 2017/8/25.
 * 1. 直接执行方法
 */
public class test1 {
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("com.reflection_new.third_getinfo.Person");
            //调用指定的方法
            Method me = c.getMethod("getBasicInfo");
            //实例化Person对象并调用方法
            me.invoke(c.newInstance());//无参

            //调用有参数的方法
            Method me2 = c.getMethod("setBasicInfo", String.class, String.class);//2个String类型的参数
            String result = (String) me2.invoke(c.newInstance(), "admin", "123456");
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
