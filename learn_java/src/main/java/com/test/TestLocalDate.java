package com.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by Wuxiang on 2017/8/11.
 */
public class TestLocalDate {
    public static void main(String[] args) {
        // 计算两个LocalDate 时间差
        LocalDate localDate1 = LocalDate.of(2017,9,4);
        LocalDate localDate2 = LocalDate.of(2017,9,11);
        Period p = Period.between(localDate1, localDate2);
        System.out.printf("相差 : %d 年 %d 月 %d 日\n", p.getYears(), p.getMonths(), p.getDays());

        long daysDiff = ChronoUnit.DAYS.between(localDate1, localDate2);
        System.out.println("两天之间的差在天数   : " + daysDiff);

        // 计算周数
        // 第一种逻辑
        int day1 = localDate1.getDayOfWeek().getValue();
        int day2 = localDate2.getDayOfWeek().getValue();

        LocalDate localDate3 = localDate1.plus(8 - day1, ChronoUnit.DAYS);
        LocalDate localDate4 = localDate2.minus(day2 - 1, ChronoUnit.DAYS);

//        System.out.println(localDate3 + "  " + localDate4);
        long daysDiff1 = ChronoUnit.DAYS.between(localDate3, localDate4);
        System.out.println("两天之间的差在天数   : " + daysDiff1);
        System.out.println("共有周数：" + (daysDiff1 / 7 + 2));

        // 第二种逻辑
        long weeks = ChronoUnit.WEEKS.between(localDate1, localDate2);
        System.out.println("两天之间的差在周数   : " + weeks);
        System.out.println("共有周数：" + (weeks + 1));


        long aaa = ChronoUnit.DAYS.between(localDate2, LocalDate.now());
        System.out.println(aaa);


        // 测试周数  返回 1-7
        LocalDate localDate = LocalDate.of(2017,10,15);
        System.out.println(localDate.getDayOfWeek().getValue());
    }
}
