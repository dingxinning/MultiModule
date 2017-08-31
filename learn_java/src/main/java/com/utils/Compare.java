package com.utils;

/**
 * Created by Wuxiang on 2017/3/23.
 */
public class Compare {
    public static void main(String[] args) {
        String a = "1";
        String b = "30";
        System.out.println(Integer.valueOf(a)>Integer.valueOf(b));

        //a==b  返回0
        //a<b 返回-1
        //a>b 返回1

        long startTime=System.currentTimeMillis();

        for(int i=0;i<100000000;i++) {
            i++;
        }
        //执行方法
        long endTime=System.currentTimeMillis();
        float excTime=(float)(endTime-startTime)/1000;
        System.out.println("执行时间："+excTime+"s");
    }
}
