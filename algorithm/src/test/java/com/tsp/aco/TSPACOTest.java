package com.tsp.aco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/20.
 * 最佳长度：12263  （2s 692ms）
 */
public class TSPACOTest {
    @Test
    public void testTSP() throws Exception {
        System.out.println("Start....");
        TSPACO aco = new TSPACO(48, 10, 100, 1.f, 5.f, 0.5f);
        aco.init("src/main/resources/TSPData.txt");
        aco.solve();
    }

}