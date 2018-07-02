package com.test;

import java.util.UUID;

/**
 * Created by Wuxiang on 2018/4/27
 */
public class TestByte {
    public static final Byte STATUS_NOT_SYNC = 0;

    public static void main(String[] args) {
        System.out.println(STATUS_NOT_SYNC);

        System.out.println(Integer.valueOf(STATUS_NOT_SYNC));

        System.out.println(UUID.randomUUID().toString());

        if (1 == 1) {
            System.out.println("1");
        }

        {
            System.out.println("2");
        }
    }
}
