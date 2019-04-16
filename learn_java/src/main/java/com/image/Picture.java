package com.image;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by wuxiang on 2019/4/16.
 * <p>
 * 图片去底工具
 */
public class Picture {

    /**
     * 图片去底 - 将纯色背景的图片转换为背景透明的图片
     *
     * @param orignBase64 原始图片base64编码
     * @param colorRange  容差值（0-255）
     * @return targetBase64 处理后的图片base64编码
     */
    public static String convert(String orignBase64, int colorRange) {
        String targetBase64 = null;
        try {
            BufferedImage orignImage = Imagebase64.base642BufferedImage(orignBase64);
            ImageIcon imageIcon = new ImageIcon(orignImage);
            BufferedImage targetImage = new BufferedImage(imageIcon.getIconWidth(),
                    imageIcon.getIconHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            Graphics2D g2D = (Graphics2D) targetImage.getGraphics();
            g2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getImageObserver());

            int alpha;
            for (int j1 = targetImage.getMinY(); j1 < targetImage.getHeight(); j1++) {
                for (int j2 = targetImage.getMinX(); j2 < targetImage.getWidth(); j2++) {
                    int rgb = targetImage.getRGB(j2, j1);
                    alpha = colorInRange(rgb, colorRange) ? 0 : 255;
                    rgb = (alpha << 24) | (rgb & 0x00ffffff);
                    targetImage.setRGB(j2, j1, rgb);
                }
            }
            g2D.drawImage(targetImage, 0, 0, imageIcon.getImageObserver());

            targetBase64 = Imagebase64.bufferedImage2Base64(targetImage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return targetBase64;
    }

    public static boolean colorInRange(int color, int colorRange) {
        int red = (color & 0xff0000) >> 16;
        int green = (color & 0x00ff00) >> 8;
        int blue = (color & 0x0000ff);
        if (red >= colorRange && green >= colorRange && blue >= colorRange) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        String orignFile = "D:///sign.jpg";
        int colorRange = 70;

        String base64 = Imagebase64.image2Base64(orignFile);

        String targetBase64 = convert(base64, colorRange);

        Imagebase64.base642Image(targetBase64);


    }
}
