package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public class ListTest {
    public static void main(String []args){
        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.remove(2);

        System.out.println(list.toString());

        //list的遍历方式
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
