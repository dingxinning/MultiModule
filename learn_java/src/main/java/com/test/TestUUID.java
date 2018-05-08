package com.test;

import java.util.UUID;

/**
 * Created by Wuxiang on 2018/5/4
 */
public class TestUUID {
    public static void main(String[] args) {

        System.out.println(UUID.randomUUID().toString());

        System.out.println(String.valueOf(System.currentTimeMillis()));
    }
}
