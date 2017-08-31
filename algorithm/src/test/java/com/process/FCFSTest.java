package com.process;

import org.junit.Test;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class FCFSTest{
    FCFS fcfs = new FCFS("src/main/resources/ProcessData.txt");

    @Test
    public void testExecute() throws Exception {
        fcfs.execute();
    }

}