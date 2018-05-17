package com.jvm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Wuxiang on 2018/5/17
 * 通过WeakHashMap来了解弱引用的使用场景
 *
 * HashMap的这个好理解，已经 map.remove(a); 所以只剩下 b了
 *
 * WeakHashMap的，由于 a 所对应的内存上强引用已经被移除，只剩下弱引用，gc后被回收，因此只剩下 b了
 */
public class WeakHashMapDemo {

    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("b");
        Map weakMap = new WeakHashMap();
        Map map = new HashMap();
        map.put(a, "aaa");
        map.put(b, "bbb");
        weakMap.put(a, "aaa");
        weakMap.put(b, "bbb");
        map.remove(a);
        a = null;
        b = null;
        System.gc();
        Iterator mapIter = map.entrySet().iterator();
        while (mapIter.hasNext()) {
            Map.Entry entry = (Map.Entry) mapIter.next();
            System.out.println("map:" + entry.getKey() + ": " + entry.getValue());
        }
        Iterator weakIter = weakMap.entrySet().iterator();
        while (weakIter.hasNext()) {
            Map.Entry entry = (Map.Entry) weakIter.next();
            System.out.println("map:" + entry.getKey() + ": " + entry.getValue());
        }

    }
}
