package com.image;

import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by wuxiang on 2019/4/16.
 *
 * image 和 base64 互相转换工具类
 */
public class Imagebase64 {

    private static BASE64Encoder encoder = new sun.misc.BASE64Encoder();
    private static BASE64Decoder decoder = new sun.misc.BASE64Decoder();
    private static final String IMAGEIO_WRITE_TYPE = "png";

    /**
     * image 转 base64编码
     *
     * @param imagePath image图片路径
     * @return
     */
    static String image2Base64(String imagePath) {
        String type = StringUtils.substring(imagePath, imagePath.lastIndexOf(".") + 1);
        String imageString = null;
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, type, baos);
            byte[] bytes = baos.toByteArray();
            imageString = encoder.encode(bytes);
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }

    /**
     * base64编码 转 image
     *
     * @param base64String
     */
    static void base642Image(String base64String) {
        try {
            byte[] bytes = decoder.decodeBuffer(base64String);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            BufferedImage bufferedImage = ImageIO.read(bais);
            ImageIO.write(bufferedImage, IMAGEIO_WRITE_TYPE, new File("d://out.jpg"));
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * BufferedImage 转 base64编码
     *
     * @param bufferedImage
     * @return
     */
    static String bufferedImage2Base64(BufferedImage bufferedImage) {
        String imageString = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, IMAGEIO_WRITE_TYPE, baos);
            byte[] bytes = baos.toByteArray();
            imageString = encoder.encode(bytes);
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }

    /**
     * base64编码 转 BufferedImage
     *
     * @param base64String
     * @return
     */
    static BufferedImage base642BufferedImage(String base64String) {
        BufferedImage bufferedImage = null;
        try {
            byte[] bytes = decoder.decodeBuffer(base64String);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            bufferedImage = ImageIO.read(bais);
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }

}
