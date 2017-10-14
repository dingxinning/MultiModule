package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2016/12/29.
 * 遍历 list
 * 使用方法 add、remove、subList、contains、containAll、retainAll
 * ListIterator
 */
public class ListTest {
    public static void main(String []args){
        List<String> list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.remove(2);  // 根据索引 移除对象
        System.out.println(list.toString());
        list.add("eee");
        list.add("132");
        list.add("eee");
        list.remove("eee");  // 从前向后扫描，移除第一个找到的对象
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

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        List<String> newlist = list.subList(2, 4);
        System.out.println("截取子列表：" + newlist.toString());
        String str = list.get(1);
        System.out.println("是否存在：" + list.contains(str));
        System.out.println("是否存在：" + list.containsAll(newlist));

        // 取 交集
        list.retainAll(newlist);
        System.out.println(list.toString());

        // ListIterator 用于List的访问，可以双向移动
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " . "
                    + listIterator.nextIndex() + " . "
                    + listIterator.previousIndex());
        }
    }
}
