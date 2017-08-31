package com.spring.aop_aspect;

import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/4/1.
 * 演出类
 */
@Component("perform")
public class Performance {

    public int perform(int start) throws Exception {
        System.out.println("开场人数："+start);
        if (start < 3) {
            throw new Exception("因为人数不够，表演失败！！！");
        }
        
        System.out.println("---表演start---");

        int temp = (int) (Math.random() * 100) + 1;
        System.out.println("表演中吸引了更多的人来观看："+temp);
        
        System.out.println("---表演end---");
        
        return start+temp;
    }
}
