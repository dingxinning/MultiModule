package com.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuxiang on 2018/10/26 13:47
 */
public class TestBigDecimal {
    public static void main(String[] args) {

        // 对比 double 和 Double 赋值
        double test;
        Double test1;
        test =  0;
        test =  0.0;
//        test1 = 0;
        test1 = 0.0;

        test1.doubleValue();
        test1 = null;

        BigDecimal aaa = null;
        Double test2 = aaa == null ? 0.0:aaa.doubleValue();


        List<BigDecimal> bigDecimalList = Arrays.asList(BigDecimal.valueOf(-1), BigDecimal.valueOf(-2));

        BigDecimal count = BigDecimal.valueOf(0);
        for (BigDecimal aBigDecimalList : bigDecimalList) {
            count = count.add(aBigDecimalList);
        }
        System.out.println(count);
        System.out.println(count.abs());
        System.out.println(BigDecimal.valueOf(2).compareTo(BigDecimal.valueOf(3)));
        System.out.println(BigDecimal.valueOf(4).subtract(BigDecimal.valueOf(2)));
    }
}
