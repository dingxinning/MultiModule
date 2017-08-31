package com.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by Wuxiang on 2017/8/18.
 */
public class Html2String {
    public static void main(String[] args) {

        String html = readTxtFile02("C:\\Users\\yxrsw\\Desktop\\new.html");
        System.out.println(html);
    }

    /**
     * 将 html 转换成string ，方便上传，处理
     * @param filePath
     * @return
     */
    public static String readTxtFile02(String filePath){

        String sHtml = "";
        try {
            String encoding="UTF-8";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = "";
                while((lineTxt = bufferedReader.readLine()) != null){
                    //System.out.println(lineTxt);
                    sHtml = sHtml + lineTxt;
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return sHtml;
    }
}
