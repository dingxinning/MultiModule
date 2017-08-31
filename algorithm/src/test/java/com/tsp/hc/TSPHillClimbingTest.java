package com.tsp.hc;

import org.junit.Test;

/**
 * Created by Wuxiang on 2017/4/20.
 * 最佳长度：15417
 */
public class TSPHillClimbingTest {
    @Test
    public void testTSP() throws Exception {
        System.out.println("Start....");
        TSPHillClimbing hillClimbing = new TSPHillClimbing(48, 5000);
        hillClimbing.init("src/main/resources/TSPData.txt");
        hillClimbing.solve();
    }

}