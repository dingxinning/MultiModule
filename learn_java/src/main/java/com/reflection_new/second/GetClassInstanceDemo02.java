package com.reflection_new.second;

import com.reflection_new.first_class.SUser;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class GetClassInstanceDemo02 {
    public static void main(String[] args) {
        Class<?> c = null;
        try{
            c = Class.forName("com.reflection_new.first_class.SUser");//实例化class
            SUser user = null;
            user = (SUser)c.newInstance();//实例化SUser类
//          （要求SUser类必须有无参构造方法，否则报错：java.lang.InstantiationException
            //因为newInstance()方法调用的是SUser类的无参构造方法进行的实例化  ）
            user.setUserName("admin");
            user.setPassWord("123456");
            System.out.println(user);//默认调用toString方法
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
