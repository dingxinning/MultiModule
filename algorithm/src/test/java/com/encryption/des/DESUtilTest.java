package com.encryption.des;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/17.
 */
public class DESUtilTest {

    @Test
    public void encrypt() throws Exception {
        //待加密内容
        String str = "测试内容";
        //密码，长度要是8的倍数
        String password = "12345678";
        byte[] result = DESUtil.encrypt(str.getBytes(), password);
        System.out.println("加密后内容为："+new String(result));

        //直接将如上内容解密
        byte[] decryResult = DESUtil.decrypt(result, password);
        System.out.println("解密后内容为："+new String(decryResult));
    }

}