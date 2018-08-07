package com.test;

import com.utils.DateConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/12/6.
 */
public class TestDate {
    public static void main(String[] args) {
        try {
            Date date = DateConversion.string2date("2017-12-5", DateConversion.dashDateFormat);
            Long l = date.getTime();
            Date date1=new Date(l);
            System.out.println(date1);

        } catch (ParseException e) {
            e.printStackTrace();
        }


        String dateStr;
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        DateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a E z");
        try {
            dateStr = sdf.format(date);
            System.out.println(dateStr);
            dateStr = sdf2.format(date);
            System.out.println(dateStr);
            dateStr = sdf3.format(date);
            System.out.println(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
