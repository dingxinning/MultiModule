package com.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class SJFTest {
    SJF sjf = new SJF("src/main/resources/Process.txt");
    @Test
    public void execute() throws Exception {
        sjf.execute();
    }

}