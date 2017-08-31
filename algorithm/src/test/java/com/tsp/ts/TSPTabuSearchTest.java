package com.tsp.ts;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/20.
 * 最佳长度：12672   （242ms）
 */
public class TSPTabuSearchTest {
    @Test
    public void testTSP() throws Exception {
        System.out.println("Start....");
//        TSPTabuSearch tabu = new TSPTabuSearch(16, 100, 20, 5);
//        tabu.init("src/main/resources/k-data.txt");
        TSPTabuSearch tabu = new TSPTabuSearch(48, 1000, 200, 20);
        tabu.init("src/main/resources/TSPData.txt");
        tabu.solve();
    }

}