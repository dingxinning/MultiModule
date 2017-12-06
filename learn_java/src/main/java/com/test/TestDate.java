package com.test;

import com.utils.DateConversion;

import java.text.ParseException;
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
    }
}
