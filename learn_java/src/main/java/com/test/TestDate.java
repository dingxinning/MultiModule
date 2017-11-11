package com.test;

import com.utils.DateConversion;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/11/11.
 * 场景：mongodb中存储了String类型的date数据，需要将其转为 想要的格式
 * 同时，还需要在原来的基础上，加上8小时，因为mongo存储的是零时区的时间，取出来的String没有自动转为东八区的
 *
 * 发现：用 new Date() 不靠谱
 * 解决：使用 localDateTime 加上 8小时，再转为Date，再转为相应的格式
 *
 */
public class TestDate {
    public static void main(String[] args) {
        String s = "2017-11-07T23:23:00.000Z";
        System.out.println(s);

        System.out.println("------------使用date---------------");
        String sDate = s.split("T")[0];
        String sTime = s.split("T")[1].split("\\.")[0];

        int year = Integer.parseInt(sDate.split("-")[0]);
        int month = Integer.parseInt(sDate.split("-")[1]);
        int dat = Integer.parseInt(sDate.split("-")[2]);

        int hrs = Integer.parseInt(sTime.split(":")[0]);
        int min = Integer.parseInt(sTime.split(":")[1]);
        int sec = Integer.parseInt(sTime.split(":")[2]);
        Date date = new Date(year, month, dat, hrs + 8, min, sec);
        System.out.println(date);
        System.out.println(DateConversion.date2String(date, DateConversion.dashDateTimeFormat));

        System.out.println("------------使用localDateTime---------------");

        LocalDateTime localDate = LocalDateTime.of(year, month, dat, hrs, min, sec);
        System.out.println(localDate);
        localDate = localDate.plus(8, ChronoUnit.HOURS);
        System.out.println(localDate);
        Date date1 = DateConversion.localDateTime2Date(localDate);
        System.out.println(DateConversion.date2String(date1, DateConversion.dashDateTimeFormat2));
    }
}
