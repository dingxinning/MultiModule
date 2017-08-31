package com.spring.bean_autowired;

import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/3/31.
 * CompactDisc的实现类
 */
@Component
public class SgtPeppers implements CompactDisc {
    private static String title = "Sgt Peppers Title";
    private static String artist = "Sgt Peppers artist";

    @Override
    public void play() {
        System.out.println(title+"  By "+artist);
    }
}
