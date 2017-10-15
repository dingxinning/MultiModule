package com.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/10/15.
 * Queue 队列
 * offer() 方法： 将元素插入到 队尾
 * peek() 方法： 在不移除的情况下，返回队头
 * poll() / remove()方法： 移除并返回队头
 *
 * LinkedList 添加了可以使其用作 栈、队列、双端队列的方法
 */
public class QueueTest {
    public static void printQ(Queue queue) {
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++){
            queue.add(rand.nextInt(i + 10));
        }
        printQ(queue);

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        qc.add('a');
        System.out.println("队头元素：" + qc.peek());
        qc.poll();
        System.out.println("队头元素：" + qc.peek());
        printQ(qc);
    }
}
