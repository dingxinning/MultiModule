package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * Created by Wuxiang on 2017/8/25.
 */
public class DateConversion {

    public static final String chineseDateTimeFormat = "yyyy年MM月dd日 HH时mm分ss秒";
    public static final String dashDateTimeFormat = "yyyy-MM-dd HH:mm:ss";
    public static final String slashDateTimeFormat = "yyyy/MM/dd HH:mm:ss";

    public static final String chineseDateFormat = "yyyy年MM月dd日";
    public static final String dashDateFormat = "yyyy-MM-dd";
    public static final String slashDateFormat = "yyyy/MM/dd";

    public static final String chineseTimeFormat = "HH时mm分ss秒";
    public static final String timeFormat = "HH:mm:ss";

    // localDate 转 Date
    public static Date localDate2Date(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }

    // Date 转 localDate
    public static LocalDate date2LocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, zone);
        return dateTime.toLocalDate();
    }

    //Date 转 字符串
    public static String date2String(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    // 字符串 转 Date
    public static Date string2date(String string, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(string);
    }

    // Date 转 Long
    public static Long date2long(Date date) {
        return date.getTime();
    }

    // Long 转 Date
    public static Date long2date(Long str) {
        return new Date(str);
    }

    public static String minute2DayHourMinute(String minute, List<Integer> dayHourMinute){
        int min = Integer.parseInt(minute);
        if(min < 60){
            dayHourMinute.add(min);
            dayHourMinute.add(0);
            dayHourMinute.add(0);
            return min + "分钟";
        }
        if(min >= 60 && min < 60 * 24){
            int h = min / 60;
            int s = min % 60;
            dayHourMinute.add(s);
            dayHourMinute.add(h);
            dayHourMinute.add(0);
            return h + "小时" + s + "分钟";
        }
        if(min >= 60 * 24){
            int d = min / (60 * 24);
            int h = (min - d * 60 * 24) / 60;
            int s = (min - d * 60 * 24) % 60;
            dayHourMinute.add(s);
            dayHourMinute.add(h);
            dayHourMinute.add(d);
            return d + "天" + h + "小时" + s + "分钟";
        }
        return null;
    }
}
