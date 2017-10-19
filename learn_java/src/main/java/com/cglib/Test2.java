package com.cglib;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wuxiang on 2017/10/19.
 * 重新生成
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Map<String, Class> classMap = new HashMap<>();
        classMap.put("id", Class.forName("java.lang.Integer"));
        classMap.put("name", Class.forName("java.lang.String"));
        classMap.put("sex", Class.forName("java.lang.String"));
        classMap.put("address", Class.forName("java.lang.String"));

        DynamicBean bean = new DynamicBean(classMap);
        bean.setValue("id", 1);
        bean.setValue("name", "wx");
        bean.setValue("sex", "man");
        bean.setValue("address", "nj");
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
