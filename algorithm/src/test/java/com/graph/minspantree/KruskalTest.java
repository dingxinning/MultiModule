package com.graph.minspantree;

import com.graph.minspantree.util.Edge;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/18.
 */
public class KruskalTest {
    @Test
    public void kruskal() throws Exception {
        int[] V = {1, 2, 3, 4, 5, 6};
        Edge[] E = new Edge[10];

        E[0]=new Edge(1,2,6);
        E[1]=new Edge(1,3,1);
        E[2]=new Edge(1,4,5);
        E[3]=new Edge(2,3,5);
        E[4]=new Edge(2,5,3);
        E[5]=new Edge(3,4,5);
        E[6]=new Edge(3,5,6);
        E[7]=new Edge(3,6,4);
        E[8]=new Edge(4,6,2);
        E[9]=new Edge(5,6,6);
        Kruskal.kruskal(V, E);
    }

}