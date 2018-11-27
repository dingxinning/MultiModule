package com.collection;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by Administrator on 2016/12/29.
 * Map 允许插入空值
 */
public class MapTest {
    public static void main(String [] args){

        /*
         * HashMap 初始化参数
         * initialCapacity：HashMap中桶的数量
         * loadFactor：装载因子，扩容用的
         */
        Map map1 = new HashMap();
        Map map2 = new HashMap(16, 0.75f);

        Map<String,String> map= new HashMap<>();
        map.put("id", "1");
        map.put("name", "wx");
        map.put("age", "18");
        map.put("age", "19"); // 从来只闻新人笑，哪里识得旧人哭
        map.put("sex", "man");
        map.remove("name");
        map.put(null, "空");
        System.out.println(map);
        System.out.println("test: is 包含 'age' key：" + map.containsKey("age"));
        System.out.println("test: is 包含 '19' value：" + map.containsValue("19"));

        System.out.println("\n ---遍历hashmap的4种方式---");
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
        System.out.println();

        for (String key : map.keySet()) {
            System.out.print(map.get(key)+" ,");
        }
        System.out.println();

        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
        System.out.println();

        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey()+": ");
            System.out.print(entry.getValue()+".  ");
        }
        System.out.println("\n");

        // Map 实现对随机数进行计数
        Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
