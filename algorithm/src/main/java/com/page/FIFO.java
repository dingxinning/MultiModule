package com.page;

import com.page.util.PageUtil;

import java.util.*;

/**
 * Created by Wuxiang on 2017/4/16.
 * 先进先出置换算法
 *
 * 缺页率 = 缺页中断的次数 / 总访问次数
 */
public class FIFO {
    private int n;  //内储页框
    private int m;  //访问次数
    private int F;  //没能直接找到的次数,(F/m)为缺页率
    private int G;  //置换次数
    private List<Integer> list=null;    //访问地址走向
    private Map<Integer,Integer> map=null;

    public FIFO(String fileString,int n) {
        list = PageUtil.readPageOrientation(fileString);
        this.m = list.size();
        this.n = n;
        this.F = 0;
        this.G = 0;
        this.map = new HashMap<>();
        PageUtil.printInfo(list, this.n);
    }

    public void FIFORepleace(){
        Queue<Integer> q=new LinkedList<Integer>();
        for (int i = 0; i < m; i++) {
            int k = list.get(i);//待处理元素
            if (!map.containsValue(k)) {
                //不能直接找到次数加1
                F++;
                //如果没有装满
                if (map.size() < n) {
                    int temp = map.size();
                    map.put(temp, k);
                    q.offer(temp);
                } else {
                    //进行替换，次数加一
                    G++;
                    int temp = q.poll();//排除的元素位置
                    map.remove(temp);
                    map.put(temp, k);
                    q.offer(temp);
                }
            }
        }

        PageUtil.printResult(F, F * 1.0 / m, G);
    }
}
