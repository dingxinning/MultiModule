package com.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Wuxiang on 2017/9/1.
 * 使用 json-simple 进行简单json->java对象的转换
 */
public class ReadSimpleJSON {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("C:\\Users\\yxrsw\\Desktop\\simple_json_data.json"));
            JSONObject jsonObject = (JSONObject)object;
            String name = (String) jsonObject.get("Name");
            Long age = (Long) jsonObject.get("Age");

            JSONArray countries = (JSONArray)jsonObject.get("Countries");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Countries:");
            for(Object country : countries)
            {
                System.out.println("\t"+country.toString());
            }
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
