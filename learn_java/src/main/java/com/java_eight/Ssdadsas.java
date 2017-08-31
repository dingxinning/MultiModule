package com.java_eight;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/8/7.
 */
public class Ssdadsas {
    public static void main(String[] args) {
        Date date=new Date(2017,7,3);
        System.out.println(date);
        LocalDate localDate = LocalDate.of(2017, 7, 3);
        System.out.println(localDate);

        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        Date date1 = Date.from(instant);
        System.out.println(date1);
    }
}
