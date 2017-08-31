package com.graph.minspantree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/18.
 */
public class PrimTest {
    @Test
    public void PRIM() throws Exception {
        int [][] tree={
                {-1,6,1,5,-1,-1},
                {6,-1,5,-1,3,-1},
                {1,5,-1,5,6,4},
                {5,-1,5,-1,-1,2},
                {-1,3,6,-1,-1,6},
                {-1,-1,4,2,6,-1}
        };
        Prim.PRIM(tree, 0, 6);
    }

}