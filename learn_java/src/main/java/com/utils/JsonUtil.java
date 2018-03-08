package com.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taota on 2017/7/26.
 */
public class JsonUtil {

    public static String toJSONString(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T parseObject(String str, Class<T> cls){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> parseArray(String str, Class<T> cls){
        ObjectMapper mapper = new ObjectMapper();
        CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, cls);
        try {
            return mapper.readValue(str, listType);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T parseObjectFromFile(String filePath, Class<T> cls){
        String txt = FileUtil.txtToString(filePath);
        return parseObject(txt, cls);
    }

    public static  <T> List<T> parseArrayFromFile(String filePath, Class<T> cls){
        String txt = FileUtil.txtToString(filePath);
        return parseArray(txt, cls);
    }

    public static <T> T parseObjectFromJarFile(Class receiverCls, String filePath, Class<T> cls){
        String txt = FileUtil.jarTxtToString(receiverCls, filePath);
        return parseObject(txt, cls);
    }

}
