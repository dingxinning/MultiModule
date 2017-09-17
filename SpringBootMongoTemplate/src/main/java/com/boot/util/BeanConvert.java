package com.boot.util;

import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

//注意！该工具类尚未实现递归转换
public class BeanConvert {

    // 将实体类转为Update对象
    public static Update beanToMongoUpdate(Object bean){
        Update up = new Update();

        Field[] declaredFields = bean.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);

            try {
                if (field.get(bean) != null) {
                    up.set(field.getName(), field.get(bean));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return up;
    }

    public static Map<String, Object> beanToMap(Object bean){
        Map<String, Object> map = new HashMap<>();

        Field[] declaredFields = bean.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);

            try {
                if (field.get(bean) != null) {
                    map.put(field.getName(), field.get(bean));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return map;
    }

}
