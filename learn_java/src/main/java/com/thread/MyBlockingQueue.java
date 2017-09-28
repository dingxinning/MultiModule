package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Wuxiang on 2017/9/28.
 * 4. BlockingQueue 有序队列
 *
 * BlockingQueue 不接受null元素
 * BlockingQueue 可以是限定容量的。
 * BlockingQueue 实现主要用于生产者-使用者队列，但它另外还支持 Collection 接口。
 * BlockingQueue 实现是线程安全的。
 */
public class MyBlockingQueue extends Thread {
    public static BlockingQueue<String> queue = new LinkedBlockingQueue<String>(3);
    private int index;

    public MyBlockingQueue(int i) {
        this.index = i;
    }

    public void run() {
        try {
            queue.put(String.valueOf(this.index));
            System.out.println("{" + this.index + "} in queue!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            service.submit(new MyBlockingQueue(i));
        }
        Thread thread = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Thread.sleep((int) (Math.random() * 1000));
                        if (MyBlockingQueue.queue.isEmpty())
                            break;
                        String str = MyBlockingQueue.queue.take();
                        System.out.println(str + " has take!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        service.submit(thread);
        service.shutdown();
    }
}