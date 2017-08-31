package com.page;

import com.page.util.PageUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Wuxiang on 2017/4/16.
 * 最近最远未使用置换算法
 */
public class LRU {
    private int n;  //内储页框
    private int m;  //访问次数
    private int F;  //没能直接找到的次数,(F/m)为缺页率
    private int G;  //置换次数
    private List<Integer> list=null;    //访问地址走向
    private Map<Integer,Integer> map=null;

    public LRU(String fileString,int n) {
        list = PageUtil.readPageOrientation(fileString);
        this.m = list.size();
        this.n = n;
        this.F = 0;
        this.map = new HashMap<>();
        PageUtil.printInfo(list, this.n);
    }

    public void LRURepleace(){
        List<Integer> linkedlist = new LinkedList<Integer>();
        for (int i=0;i<m;i++)
        {
            int k=list.get(i);//待处理元素
            if (!map.containsKey(k)){
                //不能直接找到次数加1
                F++;
                if (map.size()<n){//如果没有装满
                    int temp=map.size();
                    map.put(k,temp);
                    linkedlist.add(k);//添加位置
                }
                else {
                    //进行替换，次数加一
                    G++;
                    int temp=linkedlist.get(0);
                    int c=map.get(temp);//位置
                    map.remove(temp);
                    map.put(k,c);
                    linkedlist.remove(0);
                    linkedlist.add(k);
                }
            }
            else//如果包含这个值，把这个值拿走并在后面压入
            {
                int d=linkedlist.indexOf(k);//查找存在位置
                linkedlist.remove(d);
                linkedlist.add(k);
            }
        }

        PageUtil.printResult(F, F * 1.0 / m, G);
    }
}
