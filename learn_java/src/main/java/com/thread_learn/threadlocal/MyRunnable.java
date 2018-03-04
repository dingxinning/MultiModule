package com.thread_learn.threadlocal;

/**
 * Created by Wuxiang on 2018/3/4
 */
public class MyRunnable implements Runnable {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        int number = (int) (Math.random() * 100D);
        System.out.println("设置线程(" + Thread.currentThread().getName() + "), 为" + number);
        threadLocal.set( number );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("获取线程(" + Thread.currentThread().getName() + "), 的值为" + threadLocal.get());

    }
}
