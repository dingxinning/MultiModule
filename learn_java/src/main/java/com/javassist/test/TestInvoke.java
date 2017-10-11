package com.javassist.test;

import javassist.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Wuxiang on 2017/10/11.
 */
public class TestInvoke {
    public static void main(String[] args) throws Exception {
        String[] strings1 = {"姓名", "性别"};
        List<String> stringList1 = Arrays.asList(strings1);
        String[] strings2 = {"备选1", "备选2", "备选3","备选4"};
        List<String> stringList2 = Arrays.asList(strings2);

        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass("com.javassist.test.NursingInfo");

        // 无参构造函数
        CtConstructor cons = new CtConstructor(null, ctClass);
        cons.setBody("{}");
        ctClass.addConstructor(cons);

        // 生成变量和 对应的get、set方法
        createGetSetFiled(pool.get("java.lang.String"), stringList1.get(0), ctClass);
        createGetSetFiled(pool.get("java.lang.Long"), stringList1.get(1), ctClass);
        stringList2.forEach(s -> {
            try {
                createGetSetFiled(pool.get("java.lang.String"), s, ctClass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Class<?> c = ctClass.toClass();
        Object object = c.newInstance();
        Class<?> clas = object.getClass();

        System.out.println(clas.getMethod("get" + stringList1.get(0)).invoke(object));
        clas.getMethod("set" + stringList1.get(0), String.class).invoke(object, "庞德");
        System.out.println(clas.getMethod("get" + stringList1.get(0)).invoke(object));

        System.out.println(clas.getMethod("get" + stringList1.get(1)).invoke(object));
        clas.getMethod("set" + stringList1.get(1), Long.class).invoke(object, (long)22);
        System.out.println(clas.getMethod("get" + stringList1.get(1)).invoke(object));

        System.out.println(clas.getMethod("get" + stringList2.get(2)).invoke(object));
        clas.getMethod("set" + stringList2.get(2), String.class).invoke(object, "清开灵");
        System.out.println(clas.getMethod("get" + stringList2.get(2)).invoke(object));

        // 将.class文件保存写入
        ctClass.writeFile();

        // 创建新实例
        Object o = Class.forName("com.javassist.test.NursingInfo").newInstance();
        System.out.println(o.getClass().getMethod("get" + stringList1.get(0)).invoke(o));
    }

    private static void createGetSetFiled(CtClass type, String name, CtClass ctClass) throws Exception{
        CtField param = new CtField(type, name, ctClass);
        param.setModifiers(Modifier.PRIVATE);
        ctClass.addMethod(CtNewMethod.setter("set" + name, param));
        ctClass.addMethod(CtNewMethod.getter("get" + name, param));
        ctClass.addField(param);
    }
}
