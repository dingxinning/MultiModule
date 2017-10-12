package com.utils;

/**
 * Created by Wuxiang on 2017/10/12.
 * 开始时间
 * 结束时间
 *
 * 计算时间差
 */
public class CountRunTime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            i++;
        }
        //执行方法
        long endTime = System.currentTimeMillis();
        float excTime = (float) (endTime - startTime) / 1000;
        System.out.println("执行时间：" + excTime + "s");
    }
}
