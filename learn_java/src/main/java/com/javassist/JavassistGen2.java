package com.javassist;

import javassist.*;

/**
 * Created by Wuxiang on 2017/10/11.
 */
public class JavassistGen2 {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.makeClass("com.javassist.User");

        //创建属性
        CtField field01 = CtField.make("private int id;", cc);
        CtField field02 = CtField.make("private String name;", cc);
        cc.addField(field01);
        cc.addField(field02);

        //创建方法
        CtMethod method01 = CtMethod.make("public String getName(){return name;}", cc);
        CtMethod method02 = CtMethod.make("public void setName(String name){this.name = name;}", cc);
        cc.addMethod(method01);
        cc.addMethod(method02);
        CtMethod method03 = CtMethod.make("public int getId(){return id;}", cc);
        CtMethod method04 = CtMethod.make("public void setId(int id){this.id = id;}", cc);
        cc.addMethod(method03);
        cc.addMethod(method04);

        //添加有参构造器
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType, pool.get("java.lang.String")}, cc);
//        constructor.setBody("{this.id=id;this.name=name;}");
        // 应该这样构造！！！
        constructor.setBody("{$0.id=$1;$0.name=$2;}");
        cc.addConstructor(constructor);
        //无参构造器
        CtConstructor cons = new CtConstructor(null, cc);
        cons.setBody("{}");
        cc.addConstructor(cons);


        Class<?> c = cc.toClass();
        Object o = c.getConstructor(int.class, String.class).newInstance(1, "123");
        System.out.println(o.getClass().getMethod("getName").invoke(o));
        System.out.println(o.getClass().getMethod("getId").invoke(o));
    }
}
