package com.multi.project.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Wuxiang on 2018/1/28
 *
 * 16.1  对比 数组和容器
 *
 * 数组固定长度，强调效率
 * 容器可变长度，强调灵活
 */
public class ContainerComparison {
    public static void main(String[] args) {

        // 数组使用 [] 来访问元素
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for(int i = 0; i < 5; i++){
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        int[] integers = { 0, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);


        // List 使用 add() 、 get()
        List<BerylliumSphere> sphereList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        List<Integer> intList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(99);
        System.out.println(intList);
        System.out.println(intList.get(4));


        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}

