package com.reflection_new.fourth_setget;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Wuxiang on 2017/8/25.
 * 2. 操作属性/执行“拼接的方法”
 *
 * 正好在体温单项目中用到，  动态生成 方法名
 */
public class test2 {
    public static void main(String[] args) {
        try{
            //1、实例化class对象
            Class<?> c = Class.forName("com.reflection_new.third_getinfo.Person");//实例化class
            Object obj = c.newInstance();//实例化对象
            setter(obj,"userName","admin",String.class);
            System.out.println(getter(obj,"userName"));

            Field nameField = c.getDeclaredField("userName");//获取userName属性
            Field pwdField = c.getDeclaredField("passWord");//获取passWord属性

            //让两个属性对外可见，private私有属性的外界不能访问
            //若是不处理将报错：
//          java.lang.IllegalAccessException: Class com.wjl.reflect.InvokeMethodDemo02 can not access a member of class com.wjl.reflect.Person with modifiers "private"
            nameField.setAccessible(true);
            pwdField.setAccessible(true);
            //赋值
            nameField.set(obj,"sa");
            pwdField.set(obj,"sa");

            //取值
            System.out.print("用户名："+nameField.get(obj)+"\t");
            System.out.print("密码："+pwdField.get(obj));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //set方法
    public static void setter(Object obj,String attr,Object value,Class<?> type){
        try{
            System.out.println("执行的方法："+("set"+initStr(attr)));
            //getMethod(param1,param2):param1方法名称，param2参数类型
            Method me = obj.getClass().getMethod("set"+initStr(attr), type);
            me.invoke(obj,value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //get方法
    public static String getter(Object obj,String attr){
        String result = "";
        try{
            System.out.println("执行的方法："+("get"+initStr(attr)));
            Method me = obj.getClass().getMethod("get"+initStr(attr));
            result = (String)me.invoke(obj);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    //该方法用来将字符串的首字母大写
    public static String initStr(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
