package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wuxiang on 2017/9/28.
 * 6. CountDownLatch
 * 一个同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待。
 *
 * CountDownLatch最重要的方法是countDown()和await()，前者主要是倒数一次，后者是等待倒数到0，如果没有到达0，就只有阻塞等待了。
 *
 *  设置 countDown()方法， 在当前计数到达零之前，await() 方法会一直受阻塞。
 *  之后，会释放所有等待的线程，await 的所有后续调用都将立即返回。
 */
public class MyCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        // 开始的倒数锁
        final CountDownLatch begin = new CountDownLatch(1);
        // 结束的倒数锁
        final CountDownLatch end = new CountDownLatch(5);
        // 十名选手
        final ExecutorService exec = Executors.newFixedThreadPool(10);

        for (int index = 0; index < 10; index++) {
            final int NO = index + 1;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        begin.await(); //一直阻塞
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("No." + NO + " arrived");
                    } catch (InterruptedException e) {
                    } finally {
                        end.countDown();
                    }
                }
            };
            exec.submit(run);
        }
        System.out.println("Game Start");
        begin.countDown();
        end.await(); //一直阻塞
        System.out.println("Game Over");
        exec.shutdown();
    }
}
