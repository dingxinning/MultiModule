package com.spring.bean_autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Wuxiang on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;
    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        mediaPlayer.play();
        compactDisc.play();
    }
}
