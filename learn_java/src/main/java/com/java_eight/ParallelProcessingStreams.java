package com.java_eight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wuxiang on 2016/12/30.
 * java 8 新特性
 * 八、访问接口的默认方法  续集
 * 并行streams
 */
public class ParallelProcessingStreams {
    public static void main(String[]args){
//        int max = 1000000;
//        List<String> values = new ArrayList<>(max);
//        for (int i = 0; i < max; i++) {
//            UUID uuid = UUID.randomUUID();
//            values.add(uuid.toString());
//        }
//        long t0 = System.nanoTime();
//
////        long count = values.stream().sorted().count();   //串行
//        long count = values.parallelStream().sorted().count();  //并行
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("sequential sort took: %d ms", millis));

        //串行花费  867ms 左右
        //并行花费  669ms 左右


        //Map
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "No." + i);
        }
        map.putIfAbsent(2, "No." + 567);
        map.putIfAbsent(9, "No." + 899);
        //putIfAbsent 会做重复性检查，所以上述两行无效

        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));  //遍历
        System.out.println();

        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));             // 将 3 修改为 33
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));     //删除9  false
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        map.computeIfAbsent(23, num -> "No." + num);
        System.out.println(map.containsKey(23));    //添加23  true
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        map.computeIfAbsent(11, num -> "bam");
        System.out.println(map.get(11));             // 添加11位置的值 为bam ???
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        //删除
        map.remove(3, "No.3");
        System.out.println(map.get(3));             // No.33

        map.remove(3, "No.33");
        System.out.println(map.get(3));             // null

        map.getOrDefault(42, "not found");  // not found  ???
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        //合并
        map.merge(9, "No.9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // 增加No.9
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // No.9concat
        System.out.print("遍历Map：");
        map.forEach((id, val) -> System.out.print(val+", "));
        System.out.println();




    }
}
