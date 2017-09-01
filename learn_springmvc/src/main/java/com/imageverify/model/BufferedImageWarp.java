package com.imageverify.model;

import java.awt.image.BufferedImage;

/**
 * Created by Wuxiang on 2017/6/24.
 */
public class BufferedImageWarp {
    /**
     * 这个是key
     */
    private boolean key;
    /**
     * 图片对象
     */
    private BufferedImage bufferedImage;

    public BufferedImageWarp(boolean key, BufferedImage bufferedImage) {
        this.key = key;
        this.bufferedImage = bufferedImage;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
}