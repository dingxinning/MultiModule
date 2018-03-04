package com.thread_learn.threadlocal;

/**
 * Created by Wuxiang on 2018/3/4
 */
public class ThreadLocalExample {
    public static void main(String[] args) throws InterruptedException {

        // 创建了两个线程共享一个MyRunnable实例。
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        // 每个线程执行 run()方法的时候，会给同一个ThreadLocal实例设置不同的值。
        thread1.start();
        thread2.start();

        thread1.join(); // 等待线程1终止
        thread2.join(); // 等待线程2终止


        // 然而，由于是ThreadLocal对象，所以两个线程无法看到彼此的值。
        // 因此，可以设置或者获取不同的值。
    }
}
