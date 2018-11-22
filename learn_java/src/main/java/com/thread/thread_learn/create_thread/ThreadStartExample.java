package com.thread.thread_learn.create_thread;

/**
 * Created by Wuxiang on 2018/3/2
 */
public class ThreadStartExample {
    public static void main(String[] args) {

        // 获得当前线程的名称
        System.out.println("当前线程：" + Thread.currentThread().getName());

        // 开启10个线程，尽管启动线程的顺序是有序的，但是执行的顺序并非是有序的。
        for (int i = 0; i < 10; i++) {
            new Thread("" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }
    }
}
