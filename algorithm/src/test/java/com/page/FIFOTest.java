package com.page;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class FIFOTest {
    FIFO fifo = new FIFO("src/main/resources/PageOrientation.txt", 3);
    @Test
    public void FIFORepleace() throws Exception {
        fifo.FIFORepleace();
    }

}