package com.thinking_in_java.chapter11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Wuxiang on 2018/1/28
 *
 * Thinking in Java  11章
 * 11.2  用 Integer对象填充一个 Collection
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            c.add(i);
        }

        for(Integer i : c){
            System.out.print(i + ", ");
        }
    }

    /* Output:
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
    */
}
