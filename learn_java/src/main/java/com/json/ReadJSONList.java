package com.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Wuxiang on 2017/9/1.
 * 使用 org.json 进行json list -> java对象 的转换
 */
public class ReadJSONList {
    public static void main(String[] args) throws Exception {
        String context = new ReadFile().ReadFile("C:\\Users\\yxrsw\\Desktop\\json_list.json");
        JSONArray jsonArray = new JSONArray(context);
        int iSize = jsonArray.length();
        System.out.println("Size:" + iSize);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (int i = 0; i < iSize; i++) {
            JSONObject json = jsonArray.getJSONObject(i);

            TestObject testObject = new TestObject();
            testObject.setAge((int) json.get("Age"));
            testObject.setName(json.get("Name") == JSONObject.NULL ? null : (String) json.get("Name"));
            testObject.setTime(json.get("Time") == JSONObject.NULL ? null : Timestamp.valueOf((String) json.get("Time")));
            testObject.setCurrentDate(json.get("CurrentDate") == JSONObject.NULL ? null : format.parse((String) json.get("CurrentDate")));
            System.out.println(testObject.toString());
        }
    }

}
