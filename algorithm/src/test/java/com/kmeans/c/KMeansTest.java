package com.kmeans.c;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/5/1.
 */
public class KMeansTest {
    @Test
    public void calculate() throws Exception {
        KMeans kmeans = new KMeans(3,15,0,10);
        kmeans.init();
        kmeans.calculate();
    }

}