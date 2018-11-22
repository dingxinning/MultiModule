package com.thread.thread_learn.create_thread;

/**
 * Created by Wuxiang on 2018/3/2
 */
public class ThreadStart {
    public static void main(String[] args) {

        // 运行Java线程类
        Thread thread = new Thread();
        thread.start();


        // 为线程编写运行时代码
        // 第一种方式 创建Thread的子类
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println("线程名:" + myThread1.getName());

        // 或者创建Thread匿名函数
        Thread myThread2 = new Thread(){
            public void run() {
                System.out.println("MyThread2 running");
            }
        };
        myThread2.start();
        System.out.println("线程名:" + myThread2.getName());


        // 第二种方式 实现Runnable接口
        Thread myThread3 = new Thread(new MyRunnable());
        myThread3.start();
        System.out.println("线程名:" + myThread3.getName());

        // 或者创建一个实现了Runnable接口的匿名类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyThread4 running");
            }
        };
        Thread myThread4 = new Thread(runnable, "thread-004");
        myThread4.start();
        System.out.println("线程名:" + myThread4.getName());


    }

}
