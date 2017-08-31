package com.tsp.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/20.
 * 总距离为:12842
 */
public class TSPGreedyTest {
    @Test
    public void testTSP() throws Exception {
        System.out.println("Start....");
        TSPGreedy ts = new TSPGreedy(48);
        ts.init("src/main/resources/TSPData.txt");
//        ts.printinit();
        ts.solve();
    }

}