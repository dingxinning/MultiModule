package com.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Wuxiang on 2017/3/6.
 */
public class Date2String {

    public static void main(String[] args) throws ParseException {

        //Date转string
        Date date = new Date();
        System.out.println(date);

        // 使用 String.format的 %tx转换符  （推荐，听说效率高）
        System.out.printf("%tF%n", date);
        System.out.println(String.format("%tR", date));
        System.out.println(String.format("%tb", date));
        System.out.println(String.format(Locale.US,"%ta",date));
        System.out.println(String.format(Locale.US,"%tA",date));
        System.out.println(String.format("%tC", date));
        System.out.println(String.format("%ty", date));
        System.out.println(String.format("%tj", date));
        System.out.println(String.format("%tm", date));
        System.out.println(String.format("%td", date));
        System.out.println(String.format("%te", date));

        // 使用 SimpleDateFormat
        SimpleDateFormat format;
        format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));

        format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  //12小时制
        System.out.println(format.format(date));

        format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //24小时制
        format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai")); //设置时区
        System.out.println(format.format(date));

        // 使用 DateFormat
        System.out.println(dateToString(date, "MEDIUM"));

        //string 转 Date
        String string = "2016-10-24 21:59:06";
        System.out.println(format.parse(string));

        //将时间string转换为时间戳
        String s1 = "2017-03-07 14:21:01";
        System.out.println(dateToStamp(s1));

        //将时间戳转换为时间string
        String s2 = "1488867661863";
        System.out.println(stampToDate(s2));



    }


    public static String dateToStamp(String s) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        return String.valueOf(ts);
    }

    public static String stampToDate(String s){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);
    }

    public static String dateToString(Date date, String type) {
        String str = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (type.equals("SHORT")) {
            // 07-1-18
            format = DateFormat.getDateInstance(DateFormat.SHORT);
            str = format.format(date);
        } else if (type.equals("MEDIUM")) {
            // 2007-1-18
            format = DateFormat.getDateInstance(DateFormat.MEDIUM);
            str = format.format(date);
        } else if (type.equals("FULL")) {
            // 2007年1月18日 星期四
            format = DateFormat.getDateInstance(DateFormat.FULL);
            str = format.format(date);
        }
        return str;
    }

}
