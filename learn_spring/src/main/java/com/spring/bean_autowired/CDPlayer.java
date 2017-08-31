package com.spring.bean_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/3/31.
 * MediaPlayer的实现类
 */
@Component
public class CDPlayer implements MediaPlayer {
    @Autowired
    private CompactDisc compactDisc;

    //构造器注入
    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        System.out.println("CD");
        compactDisc.play();
    }
}
