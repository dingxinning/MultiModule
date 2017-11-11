package com.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/11/11.
 *
 * 根据出生日期 获取岁数
 */
public class GetAge {
    public static void main(String[] args) throws Exception {
        Date date = DateConversion.string2date("1996-08-23 17:20:20", DateConversion.dashDateTimeFormat);

        System.out.println(getAge(date));
    }

    //由出生日期获得年龄
    private static  int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            }else{
                age--;
            }
        }
        return age;
    }
}
