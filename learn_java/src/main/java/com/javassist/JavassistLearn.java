package com.javassist;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtField.Initializer;
import javassist.CtMethod;
import javassist.CtNewMethod;

/**
 * Created by Wuxiang on 2017/10/10.
 *
 * 利用 javassist动态创建类  JavassistClass
 *
 * 创建属性
 * get set 方法
 * 函数
 */
public class JavassistLearn {
    public static void main(String[] args) throws Exception {
        ClassPool cp = ClassPool.getDefault();
        CtClass ctClass = cp.makeClass("com.javassist.JavassistClass");

        // 创建name字段，生成get set 方法
        //参数  1：属性类型  2：属性名称  3：所属类CtClass
        CtField ctField = new CtField(cp.get("java.lang.String"), "name", ctClass);
        ctField.setModifiers(Modifier.PRIVATE);
        //设置name属性的get set方法
        ctClass.addMethod(CtNewMethod.setter("setName", ctField));
        ctClass.addMethod(CtNewMethod.getter("getName", ctField));
        ctClass.addField(ctField, Initializer.constant("default"));

        // 构造函数
        //参数  1：参数类型   2：所属类CtClass
        CtConstructor ctConstructor = new CtConstructor(new CtClass[]{}, ctClass);
        StringBuffer body;
        body = new StringBuffer();
        body.append("{\n name=\"me\";\n}");
        ctConstructor.setBody(body.toString());
        ctClass.addConstructor(ctConstructor);

        // 公共方法
        //参数：  1：返回类型  2：方法名称  3：传入参数类型  4：所属类CtClass
        CtMethod ctMethod = new CtMethod(CtClass.voidType, "execute", new CtClass[]{}, ctClass);
        ctMethod.setModifiers(Modifier.PUBLIC);
        body = new StringBuffer();
        body.append("{\n System.out.println(name);");
        body.append("\n System.out.println(\"execute ok\");");
        body.append("\n return ;");
        body.append("\n}");
        ctMethod.setBody(body.toString());
        ctClass.addMethod(ctMethod);

        ctClass.writeFile();

        // 利用反射，调用方法
        Class<?> c = ctClass.toClass();
        Object o = c.newInstance();
        Method method = o.getClass().getMethod("execute");
        //调用字节码生成类的execute方法
        method.invoke(o);
    }
}
