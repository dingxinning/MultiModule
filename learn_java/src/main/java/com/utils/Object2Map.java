package com.utils;

import com.cglib.LeapRole;
import com.mongodb.util.JSON;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wuxiang on 2017/11/1.
 * Object 与 Map 之间的转换
 * 仅限于 Object 拥有java的实体类结构
 */
public class Object2Map {
    public static void main(String[] args) throws Exception {
        LeapRole leapRole = new LeapRole();
        leapRole.setDef1("1");
        leapRole.setDef2("2");
        Object object = (Object) leapRole;
        System.out.println(object);

        Map<String, Object> map = objectToMap(object);
        System.out.println(map);

        String json = JSON.serialize(map);
        System.out.println(json);
    }

    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                continue;
            }

            field.setAccessible(true);
            field.set(obj, map.get(field.getName()));
        }

        return obj;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null){
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }

        return map;
    }
}
