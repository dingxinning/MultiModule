package com.page;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class OPTTest {
    OPT opt = new OPT("src/main/resources/PageOrientation.txt", 3);
    @Test
    public void OPTRepleace() throws Exception {
        opt.OPTRepleace();
    }

}