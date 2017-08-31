package com.reflection_new.third_getinfo;

/**
 * Created by Wuxiang on 2017/8/25.
 *
 * 1、获取接口信息和父类信息：
 */
public class get1 {
    public static void main(String[] args) {
        Class<?> c = null;
        try{
            c = Class.forName("com.reflection_new.third_getinfo.Person");

            //1、获取所有的接口信息
            Class<?> interfaces[] = c.getInterfaces();
            System.out.println("\n接口：");
            for(int j=0;j<interfaces.length;j++){
                System.out.println(interfaces[j].getName());
            }

            //2、获取父类信息
            Class<?> parentClass = c.getSuperclass();
            System.out.println("\n父类信息：\n"+parentClass);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
