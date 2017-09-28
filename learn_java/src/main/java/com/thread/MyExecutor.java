package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wuxiang on 2017/9/28.
 *  1. concurrent.Executors 线程池
 * newFixedThreadPool（固定大小线程池）
 * newCachedThreadPool（无界线程池，可以进行自动线程回收）
 * newSingleThreadExecutor（单个后台线程）
 */
public class MyExecutor extends Thread {
    private int index;

    public MyExecutor(int i) {
        this.index = i;
    }

    public void run() {
        try {
            System.out.println("[" + this.index + "] start....");
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println("[" + this.index + "] end.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
//        ExecutorService service = Executors.newFixedThreadPool(4);  // 线程池 大小为 4，后续的线程会被加进 BlockingQueue 中
        ExecutorService service = Executors.newCachedThreadPool();  // 线程池 无大小
//        ExecutorService service = Executors.newSingleThreadExecutor();  // 单线程
        for (int i = 0; i < 10; i++) {
            service.execute(new MyExecutor(i));
//            service.submit(new MyExecutor(i));
        }
        System.out.println("submit finish");
        service.shutdown();
    }
}
