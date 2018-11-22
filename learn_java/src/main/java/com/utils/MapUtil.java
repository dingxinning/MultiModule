package com.utils;

import java.util.*;

/**
 * Created by Wuxiang on 2018/3/8
 */
public class MapUtil {
    public static Map<String, Object> merge(Map<String, Object>... maps) {
        Map<String, Object> result = new HashMap<>();
        for (Map<String, Object> map : maps) {
            result.putAll(map);
        }
        return result;
    }

    public static <K, V> List<V> fuzzyGet(Map<K, V> map, String fuzzyKey) {
        List<V> result = new ArrayList<>();
        map.forEach((k, v) -> {
            if ((k + "").contains(fuzzyKey)) {
                result.add(map.get(k));
            }
        });
        return result;
    }

    public static <K, V> Map<K, V> getSubMapWithFuzzyKey(Map<K, V> map, String fuzzyKey) {
        Map<K, V> result = new HashMap<>();
        map.forEach((k, v) -> {
            if ((k + "").contains(fuzzyKey)) {
                result.put(k, v);
            }
        });
        return result;
    }

    public static boolean isPrimitiveClass(Object obj) {
        return (obj instanceof Number || obj instanceof Boolean || obj instanceof Character
                || obj instanceof String || obj instanceof Date);
    }

    public static boolean isNotPrimitiveClass(Object obj) {
        return !isPrimitiveClass(obj);
    }
}
