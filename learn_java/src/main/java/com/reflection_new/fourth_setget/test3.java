package com.reflection_new.fourth_setget;

import java.lang.reflect.Array;

/**
 * Created by Wuxiang on 2017/8/25.
 *
 * 3. 操作数组中的数据
 */
public class test3 {
    public static void main(String[] args) {
        int temp[]= {1,2,3,4,5};
        //getComponentType():返回表示数组组件类型的 Class
        Class<?> c = temp.getClass().getComponentType();
        System.out.println("数组类型："+c.getName());
        System.out.println("数组长度："+Array.getLength(temp));
        System.out.println("数组第一个内容："+Array.get(temp,0));
        //set(p1,p2,p3):p1要操作的数组 p2：要修改的内容的下标 p3:修改之后的值
        Array.set(temp,0,10);
        System.out.println("修改数组的第一个内容为："+Array.get(temp,0));

        //修改数组的长度
        int[] newArray = (int[])createNewArray(temp,10);
        print(newArray);
    }

    //创建新的数组
    public static Object createNewArray(Object obj,int length){
        Class<?> array = obj.getClass().getComponentType();//得到数组组件类型的class
        Object newObj = Array.newInstance(array, length);//创建新的数组
        System.arraycopy(obj, 0, newObj, 0, Array.getLength(obj));
        return newObj;
    }

    //打印数组内容
    public static void print(Object array){
        if(!array.getClass().isArray()){return ;}
        System.out.println(array.getClass().getComponentType()+"数组的长度为："+Array.getLength(array));
        System.out.print("数组内容：");
        for(int i=0;i<Array.getLength(array);i++){
            System.out.print(Array.get(array, i)+"、");
        }
    }
}
