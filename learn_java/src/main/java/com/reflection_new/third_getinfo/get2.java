package com.reflection_new.third_getinfo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Wuxiang on 2017/8/25.
 * 2.获取属性
 */
public class get2 {
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("com.reflection_new.third_getinfo.Person");

            //获取本类的属性
            Field field[] = c.getDeclaredFields();
            System.out.println("本类中的属性：");
            for(int i=0;i<field.length;i++){
                System.out.println("系统："+field[i]);
                System.out.print("自定义：");
                getFieldInfo(field[i]);
            }

            //公共属性
            Field fields[] = c.getFields();
            System.out.println("\n公共属性：");
            for(int i=0;i<fields.length;i++){
                System.out.println("系统："+fields[i]);
                System.out.print("自定义：");
                getFieldInfo(fields[i]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //该方法用来获取各个属性信息
    public static void getFieldInfo(Field field){
        System.out.print(Modifier.toString(field.getModifiers())+" ");//修饰符
        System.out.print(field.getType().getName()+" ");//数据类型
        System.out.print(field.getName());//方法名称
        System.out.println(";");
    }
}
