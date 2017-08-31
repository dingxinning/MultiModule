package com.graph.minspantree.util;

/**
 * Created by Wuxiang on 2017/4/18.
 */
public class Edge implements Comparable{
    public int i,j,w;
    public Edge(int i,int j,int w){
        this.i=i;
        this.j=j;
        this.w=w;
    }


    @Override
    public int compareTo(Object o) {
        Edge to=(Edge)o;
        if(this.w>to.w) return 1;
        else if(this.w==to.w) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "开始节点="+i+",中止节点="+j+",权值="+w;
    }
}
