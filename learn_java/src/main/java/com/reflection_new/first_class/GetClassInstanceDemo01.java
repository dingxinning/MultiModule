package com.reflection_new.first_class;

/**
 * Created by Wuxiang on 2017/8/25.
 * 反射:实例化Class类的三种方法
 */
public class GetClassInstanceDemo01 {
    public static void main(String[] args) {
        //实例化Class类
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        //1、使用forName（最常见）
        try{
            c1 = Class.forName("com.reflection_new.first_class.SUser");//包名+类名
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        //2、通过object类中的方法实例化
        c2 = new SUser().getClass();

        //3、通过类.class
        c3 = SUser.class;

        System.out.println("类名称1："+c1.getName());
        System.out.println("类名称2："+c2.getName());
        System.out.println("类名称3："+c3.getName());
    }
}
