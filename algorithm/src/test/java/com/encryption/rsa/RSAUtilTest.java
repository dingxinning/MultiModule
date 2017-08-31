package com.encryption.rsa;

import org.junit.Test;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/17.
 * 速度很慢  5s 961ms
 */
public class RSAUtilTest {
    @Test
    public void RSA() throws Exception {
        RSAUtil rsa = new RSAUtil();
        String str = "yanzi1225627";
        RSAPublicKey pubKey = rsa.getRSAPublicKey();
        RSAPrivateKey priKey = rsa.getRSAPrivateKey();
        byte[] enRsaBytes = rsa.encrypt(pubKey,str.getBytes());
        String enRsaStr = new String(enRsaBytes, "UTF-8");
        System.out.println("加密后==" + enRsaStr);
        System.out.println("解密后==" + new String(rsa.decrypt(priKey, rsa.encrypt(pubKey,str.getBytes()))));
    }

}