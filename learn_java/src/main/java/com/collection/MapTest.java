package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/29.
 */
public class MapTest {
    public static void main(String [] args){
        Map<String,String> map= new HashMap<>();
        map.put("id", "1");
        map.put("name", "wx");
        map.put("age", "18");
        map.put("sex", "man");
        map.remove("name");
        map.put(null, "空");

        //遍历hashmap的4种方式
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
        System.out.println("\n");

        for (String key : map.keySet()) {
            System.out.print(map.get(key)+" ,");
        }
        System.out.println("\n");

        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
        System.out.println("\n");

        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
    }
}
