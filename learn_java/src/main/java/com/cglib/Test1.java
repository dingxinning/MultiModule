package com.cglib;

import java.lang.reflect.Method;

/**
 * Created by Wuxiang on 2017/10/19.
 * 在 LeapRole 实体类的基础上， 动态添加属性
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        DynamicBean bean = new ClassUtil().dynamicClass(new LeapRole());
        bean.setValue("name","www");
        bean.setValue("address", "nanjing");
        System.out.println(bean.toString());

        // 通过反射查看所有的方法
        Object object = bean.getObject();
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.print(i + ".  " + methods[i].getName()+"(), ");
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
