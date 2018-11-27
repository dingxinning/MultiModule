package com.test;

/**
 * Created by Wuxiang on 2017/9/11.
 *
 * 测试  null point exception
 */
public class TestNullPoint {
    public static void main(String[] args){
        String aaa = null;
        if (aaa!=null && !(aaa.trim().isEmpty())) {
            System.out.println("add");
        }
        System.out.println(123);

        System.out.println(switchTest(null));

    }

    // switch 的入参不能为null，所以需要额外判断
    private static String switchTest(String string) {
        String result;
        if (string == null) {
            string = "";
        }
        switch (string) {
            case "a":
                result = "a";
                break;
            case "b":
                result = "b";
                break;
            case "c":
                result = "c";
                break;
            default:
                result = "other";
                break;
        }
        return result;
    }
}
