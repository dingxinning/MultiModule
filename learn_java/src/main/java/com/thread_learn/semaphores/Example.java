package com.thread_learn.semaphores;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 22. 信号量
 *
 * 两个线程通过发出的信号来通知对方
 *
 * 测试：Semaphore、CountingSemaphore、BoundedSemaphore
 */
public class Example {
    public static void main(String[] args) {
//        Semaphore semaphore = new Semaphore();
//        CountingSemaphore semaphore = new CountingSemaphore();
        BoundedSemaphore semaphore = new BoundedSemaphore(5);


        SendingThread sender = new SendingThread(semaphore);
        ReceivingThread receiver = new ReceivingThread(semaphore);

        receiver.start();
        sender.start();
    }
}
