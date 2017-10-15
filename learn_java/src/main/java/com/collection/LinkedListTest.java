package com.collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Wuxiang on 2017/10/15.
 * LinkedList 在list中间插入和移除更高效
 * ArrayList 擅长随机访问元素
 * LinkedList 添加了可以使其用作 栈、队列、双端队列的方法
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> pets = new LinkedList<>(
                Arrays.asList("Rat", "Manx", "Cymric", "Mutt", "Pug"));
        System.out.println(pets);
        // 返回头
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        System.out.println("pets.peek(): " + pets.peek());

        // 移除头，并返回头
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);

        // 将新元素加至 列表头部
        pets.addFirst("Rat");
        System.out.println("After addFirst(): " + pets);
        // 将新元素加至 列表尾部
        pets.offer("Cymric");
        System.out.println("After offer(): " + pets);
        pets.add("Pug");
        System.out.println("After add(): " + pets);
        pets.addLast("Hamster");
        System.out.println("After addLast(): " + pets);

        // 移除尾，并返回尾
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}
