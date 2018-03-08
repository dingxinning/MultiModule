package com.utils;

import java.io.*;

/**
 * Created by Wuxiang on 2018/3/8
 */
public class FileUtil {
    public static String txtToString(File file){
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static String txtToString(String filePath) {
        File file = new File(filePath);
        return txtToString(file);
    }

    public static String jarTxtToString(Class receiverCls, String filePath){
        InputStream ips = receiverCls.getResourceAsStream(filePath);
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(ips));
            String s = null;
            while ((s = br.readLine()) != null) {
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
