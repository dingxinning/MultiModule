package com.reflection_new.second;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class GetClassInstanceDemo04 {
    public static void main(String[] args) {
        try{
            Class c = Class.forName("com.reflection_new.first_class.SUser");
            Constructor<?> con[] = c.getConstructors();
            for(int i=0;i<con.length;i++){
                System.out.println("系统："+con[i]);
                System.out.print("自定义：");
                getConstructorInfo(con[i]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //自己拼接构造方法
    public static void getConstructorInfo(Constructor con){
        System.out.print(Modifier.toString(con.getModifiers())+" ");//修饰符
        System.out.print(con.getName());//类名称
        System.out.print("(");
        //获取参数类型
        Class<?> p[] = con.getParameterTypes();
        for(int j=0;j<p.length;j++){
            System.out.print(p[j].getName());
            if(j<p.length-1){
                System.out.print(",");
            }
        }
        System.out.print(")"+"\n");
    }
}
