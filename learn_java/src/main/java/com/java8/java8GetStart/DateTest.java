package com.java8.java8GetStart;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Wuxiang on 2017/1/2.
 * java 8 新特性
 * 九、Date API
 * Java 8 在包java.time下包含了一组全新的时间日期API。
 */
public class DateTest {
    public static void main(String []args){

        //Clock 时钟   访问当前日期和时间的方法
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();  //微秒数

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant); //创建老的java.util.Date对象

        System.out.println(millis+"   "+legacyDate);

        /*
         * Timezones 时区
         * 在新API中时区使用ZoneId来表示
         */
//        System.out.println(ZoneId.getAvailableZoneIds());  //所有的时区
        ZoneId zone1 = ZoneId.of("Greenwich");  //零时区
        ZoneId zone2 = ZoneId.of("Asia/Shanghai");  //东八区（UTC/GMT+08:00）
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());

        /*
         * LocalTime 本地时间
         * 定义了一个没有时区信息的时间
         */
        LocalTime now1 = LocalTime.now(zone1);  //由时区生成本地时间
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println("零时区 本地时间："+now1);
        System.out.println("东八区 本地时间："+now2);
//        System.out.println(now1.isAfter(now2));  // false
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
        System.out.println("相差： "+hoursBetween+"小时  即"+minutesBetween+"分钟");  //时 分 相差

        /*
         * LocalTime 提供了多种工厂方法来简化对象的创建，包括解析时间字符串。
         */
        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);       // 23:59:59
        //解析时间字符串
        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);
        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println("解析后："+leetTime);   // 13:37

        /*
         * LocalDate 本地日期
         * 表示了一个确切的日期
         */
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println("今天 "+today+"  明天 "+tomorrow+" 昨天 "+yesterday);

        LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        System.out.println("原始日期："+independenceDay+"    星期："+independenceDay.getDayOfWeek());
        //解析日期字符串
        DateTimeFormatter germanFormatter1 =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);
        LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter1);
        System.out.println("解析后："+xmas);   // 2014-12-24

        /*
         * LocalDateTime 本地日期时间
         */
        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        System.out.println("原始日期时间："+sylvester);
        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        Month month = sylvester.getMonth();
        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println("星期："+dayOfWeek+" 月份："+month+" 一天经过的分钟数："+minuteOfDay);

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("yyyy-MM-dd HH:mm:ss.nnn");
        LocalDateTime parsed = LocalDateTime.parse("2014-12-31 23:59:59.678", formatter);
        String string = formatter.format(parsed);
        System.out.println("解析后："+string);
    }
}
