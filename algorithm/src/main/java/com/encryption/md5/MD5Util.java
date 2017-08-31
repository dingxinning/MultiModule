package com.encryption.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Wuxiang on 2017/4/17.
 * MD5消息摘要算法，属Hash算法一类。MD5算法对输入任意长度的消息进行运行，产生一个128位的消息摘要。
 * 功能：
 * 1.输入任意长度的信息，经过处理，输出为128位的信息（数字指纹）；
 * 2.不同的输入得到的不同的结果（唯一性）；
 * 3.根据128位的输出结果不可能反推出输入的信息（不可逆）；
 */
public class MD5Util {
    public final static String getMD5String(String s) throws NoSuchAlgorithmException {
        char hexDigits[] = { '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F' };
        byte[] btInput = s.getBytes();
        //获得MD5摘要算法的 MessageDigest 对象
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        //使用指定的字节更新摘要
        mdInst.update(btInput);
        //获得密文
        byte[] md = mdInst.digest();
        //把密文转换成十六进制的字符串形式
        int j = md.length;
        char str[] = new char[j * 2];
        int k = 0;
        for (int i = 0; i < j; i++) {
            byte byte0 = md[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }
}
