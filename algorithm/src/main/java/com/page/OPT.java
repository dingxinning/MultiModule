package com.page;

import com.page.util.PageUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Wuxiang on 2017/4/16.
 * 最佳置换算法
 */
public class OPT {
    private int n;  //内储页框
    private int m;  //访问次数
    private int F;  //没能直接找到的次数,(F/m)为缺页率
    private int G;  //置换次数
    private List<Integer> list=null;    //访问地址走向
    private Map<Integer,Integer> map=null;

    public OPT(String fileString,int n) {
        list = PageUtil.readPageOrientation(fileString);
        this.m = list.size();
        this.n = n;
        this.F = 0;
        this.map = new HashMap<>();
        PageUtil.printInfo(list, this.n);
    }

    public void OPTRepleace(){
        int j;
        for (int i=0;i<m;i++)
        {
            int k=list.get(i);//待处理元素
            if (!map.containsValue(k)){
                //不能直接找到次数加1
                F++;
                if (map.size()<n){//如果没有装满
                    int temp=map.size();
                    map.put(temp, k);
                }
                else{
                    //进行替换，次数加一
                    G++;
                    int index=0;//把哪个位置的淘汰出去
                    int min=0;//初始最长长度
                    for (int t=0;t<n;t++)
                    {
                        for (j=i+1;j<m;j++){//看后面哪一个出现的最晚
                            if (Objects.equals(list.get(j), map.get(t))){//第一次找到
                                if (j-i>min){
                                    index=t;//更新值
                                    min=j-i;
                                }
                                break;
                            }
                        }
                        if (j==m){//如果到最后
                            index=t;
                            min=j-i;
                        }
                    }
                    map.remove(index);
                    map.put(index,k);//修改表内元素
                }
            }
        }

        PageUtil.printResult(F, F * 1.0 / m, G);
    }
}
