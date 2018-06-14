package com.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

/**
 * Created by wuxiang on 2018/6/14 10:17
 *
 * BASE64 加密 & 解密
 * MD5 加密
 * SHA-1 加密
 * SHA-256 加密
 */
public class EncryptUtil {

    public static final String KEY_MD5 = "MD5";
    public static final String KEY_SHA = "SHA";
    public static final String KEY_SHA256 = "SHA-256";

    /**
     * BASE64解密
     *
     * @param key = 需要解密的密码字符串
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     *
     * @param key = 需要加密的字符数组
     */
    public static String encryptBASE64(byte[] key) {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    /**
     * MD5加密
     *
     * @param str = 需要加密的字符数组
     * @return
     * @throws Exception
     */
    public static String encryptMD5(String str) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
        md5.update(str.getBytes());
        return byte2Hex(md5.digest());
    }

    /**
     * SHA加密
     *
     * @param str = 需要加密的字符数组
     * @return
     * @throws Exception
     */
    public static String encryptSHA(String str) throws Exception {
        MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
        sha.update(str.getBytes());
        return byte2Hex(sha.digest());
    }

    /**
     * SHA256加密
     *
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256StrJava(String str) throws Exception{
        MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA256);
        messageDigest.update(str.getBytes("UTF-8"));
        return byte2Hex(messageDigest.digest());
    }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) throws Exception {
        String string = "qwer";
        System.out.println("明文：" + string);

        // BASE64 加密解密
        String enString = EncryptUtil.encryptBASE64(string.getBytes());
        System.out.println(enString);

        String deString = new String(EncryptUtil.decryptBASE64(enString));
        System.out.println(deString);

        // MD5 加密
        System.out.println(EncryptUtil.encryptMD5(string));

        // SHA 加密
        System.out.println(EncryptUtil.encryptSHA(string));

        // SHA-256 加密
        System.out.println(EncryptUtil.getSHA256StrJava(string));
    }
}
