package com.encryption.md5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wuxiang on 2017/4/17.
 */
public class MD5UtilTest {
    @Test
    public void getMD5String() throws Exception {
        String srcString = "yanzi1225627";
		System.out.println("MD5加密后 = " + MD5Util.getMD5String(srcString));
    }

}