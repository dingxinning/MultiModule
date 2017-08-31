package com.tsp.pso;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/20.
 *
 * 迭代公式可能有问题
 *
 * 算法效率较低
 * 24806
 */
public class TSPPSOTest {
    @Test
    public void initGroup() throws Exception {
        System.out.println("Start....");
        TSPPSO pso = new TSPPSO(48, 5000, 30, 0.5f);
        pso.init("src/main/resources/TSPData.txt");
        pso.solve();
    }

}