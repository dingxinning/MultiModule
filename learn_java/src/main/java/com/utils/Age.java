package com.utils;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * 根据 String 出生日期，计算  多少岁/ 多少月 / 多少天
 */
public class Age {

    private String ageNumber;//与unit配合表示年龄，只显示岁或者月或者天
    private String ageUnit;
    private String ageCount;//大于一年的显示*岁*月，小于一岁大于一个月的显示*月*天，小于一个月的显示*天

    public static void main(String[] args) throws ParseException {
        Age age = new Age();
        age.chargeAge(DateConversion.string2date("1995-1-1 17:20:20", DateConversion.dashDateTimeFormat));
        System.out.println(age.getAgeCount());

        age.chargeAge(DateConversion.string2date("2017-8-3", DateConversion.dashDateFormat));
        System.out.println(age.getAgeCount());

        age.chargeAge(DateConversion.string2date("2017-11-07", DateConversion.dashDateFormat));
        System.out.println(age.getAgeCount());

//        for(int i=1999;i<=2005;i++){
//            for(int j=1;j<=12;j++){
//                for(int k=1;k<=31;k++){
//                    age.chargeAge( i+"-"+j+"-"+k);
//                }
//            }
//        }


    }

    private void chargeAge(Date birthDay) {
        //----------------获取当前年、月、日----------------
        Calendar cal2 = Calendar.getInstance();
        int yearNow = cal2.get(Calendar.YEAR);
        int monthNow = cal2.get(Calendar.MONTH) + 1;
        int dayOfMonthNow = cal2.get(Calendar.DAY_OF_MONTH);

//        //----------------获取出生年、月、日----------------
//        int yearBirth = Integer.parseInt((birthday.split("-"))[0]);
//        int monthBirth = Integer.parseInt((birthday.split("-"))[1]);
//        int dayOfMonthBirth = Integer.parseInt((birthday.split("-"))[2]);
//
//        //-----------------出生年月日转换为日期格式------------
//        Date birthDay = new Date(birthday.replace("-", "/"));

        Calendar cal = Calendar.getInstance();
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH) + 1;
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        //------------------计算岁数------------------------
        int age = 0, month = 0, day = 0;
        String age3 = "";
        String unit = "";
        if ((yearNow - yearBirth >= 1) && (monthNow >= monthBirth) && (dayOfMonthNow >= dayOfMonthBirth)) {
            age = yearNow - yearBirth;
            month = monthNow - monthBirth;
        } else if ((yearNow - yearBirth >= 1) && (monthNow >= monthBirth) && (dayOfMonthNow < dayOfMonthBirth)) {
            if (monthNow > monthBirth) {
                age = yearNow - yearBirth;
                month = monthNow - monthBirth - 1;
            } else if (monthNow == monthBirth) {
                age = yearNow - yearBirth - 1;
                month = 11;
            }
        } else if ((yearNow - yearBirth >= 1) && (monthNow < monthBirth)) {
            age = yearNow - yearBirth - 1;
            if ((dayOfMonthNow >= dayOfMonthBirth)) {
                month = monthNow - monthBirth + 12;
            } else {
                month = monthNow - monthBirth + 12 - 1;
            }
        } else {
            age = 0;
        }

        //------------------岁数=0，则计算月数，月数=0，则计算天数------------------------
        if (age > 0) {
            age3 = age + "";
            unit = "岁";
        } else {
            if ((yearNow == yearBirth) && (monthNow > monthBirth) && (dayOfMonthNow >= dayOfMonthBirth)) {//同在一年内出生，大于一个月的
                age3 = monthNow - monthBirth + "";
                unit = "月";
                day = dayOfMonthNow - dayOfMonthBirth;
            } else if ((yearNow == yearBirth) && (monthNow > monthBirth) && (dayOfMonthNow < dayOfMonthBirth)) {//
                if (monthNow - monthBirth - 1 == 0) {
                    long l = cal2.getTimeInMillis() - cal.getTimeInMillis();
                    age3 = new Long(l / (1000 * 60 * 60 * 24)).intValue() + "";
                    unit = "天";
                } else {
                    age3 = monthNow - monthBirth - 1 + "";
                    unit = "月";
                    if (monthNow > 1) {
                        day = common(yearNow, monthNow, dayOfMonthBirth, cal2);
                    } else {
                        day = 31 - dayOfMonthBirth + dayOfMonthNow;
                    }
                }
            } else if ((yearNow == yearBirth) && (monthNow == monthBirth)) {
                age3 = dayOfMonthNow - dayOfMonthBirth + "";
                unit = "天";
            } else if ((yearNow > yearBirth) && (dayOfMonthNow < dayOfMonthBirth)) {
                age3 = monthNow + 12 - monthBirth - 1 + "";
                unit = "月";
                if (monthNow > 1) {
                    day = common(yearNow, monthNow, dayOfMonthBirth, cal2);
                } else {
                    day = 31 - dayOfMonthBirth + dayOfMonthNow;
                }
            } else if ((yearNow > yearBirth) && (dayOfMonthNow >= dayOfMonthBirth)) {
                age3 = monthNow + 12 - monthBirth + "";
                unit = "月";
                if (monthNow > 1) {
                    day = common(yearNow, monthNow, dayOfMonthBirth, cal2);
                } else {
                    day = 31 - dayOfMonthBirth + dayOfMonthNow;
                }
            }
        }
        //----------------------------hq-----------------------------------
//	    if("岁".equals(unit)){
//	    	ageCount = age3+unit+month+"月";
//	    }else if("月".equals(unit)){
//	    	ageCount =age3+"月"+day+"天";
//	    }else{
//	    	ageCount =age3+"天";
//	    }
        ageNumber = age3;
        ageUnit = unit;
        //---------------------------------------------------------------------------------
        ageCount = ageNumber + ageUnit;
    }

    public String getAgeNumber() {
        return ageNumber;
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public String getAgeCount() {
        return ageCount;
    }

    private int common(int yearNow, int monthNow, int dayOfMonthBirth, Calendar cal2) {
        Date date1 = new Date(yearNow + "/" + (monthNow - 1) + "/" + dayOfMonthBirth);
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(date1);
        long l = cal2.getTimeInMillis() - cal3.getTimeInMillis();
        return new Long(l / (1000 * 60 * 60 * 24)).intValue();
    }

}
