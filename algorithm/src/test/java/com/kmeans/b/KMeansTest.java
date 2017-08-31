package com.kmeans.b;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/5/1.
 */
public class KMeansTest {
    @Test
    public void calculate() throws Exception {
        KMeans kmeans = new KMeans();
        kmeans.init();
        kmeans.calculate();
    }

}