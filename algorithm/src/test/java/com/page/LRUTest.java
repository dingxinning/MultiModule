package com.page;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/16.
 */
public class LRUTest {
    LRU lru = new LRU("src/main/resources/PageOrientation.txt", 3);
    @Test
    public void LRURepleace() throws Exception {
        lru.LRURepleace();
    }

}