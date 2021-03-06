package com.thread.thread_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Wuxiang on 2017/9/28.
 * 2. Semaphore 信号量
 *
 * 信号量维护了一个许可集合
 * 如有必要，在许可可用前会阻塞每一个 acquire()，然后再获取该许可。
 * 每个 release() 添加一个许可
 *
 * Semaphore 通常用于限制可以访问某些资源（物理或逻辑的）的线程数目。
 * 实际情况：大家排队上厕所，厕所只有两个位置，来了10个人需要排队。
 */
public class MySemaphore extends Thread {
    Semaphore position;
    private int id;

    public MySemaphore(int i, Semaphore s) {
        this.id = i;
        this.position = s;
    }

    public void run() {
        try {
            if (position.availablePermits() > 0) {
                System.out.println("顾客[" + this.id + "]进入厕所，有空位");
            } else {
                System.out.println("顾客[" + this.id + "]进入厕所，没空位，排队");
            }

            // 在许可可用前会阻塞每一个 acquire()，然后再获取该许可。
            position.acquire();

            System.out.println("顾客[" + this.id + "]获得坑位");
            Thread.sleep((int) (Math.random() * 1000));
            System.out.println("顾客[" + this.id + "]使用完毕");

            // 每个 release() 添加一个许可，从而可能释放一个正在阻塞的获取者。
            position.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        ExecutorService list = Executors.newCachedThreadPool();
        Semaphore position = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            list.submit(new MySemaphore(i + 1, position));
        }
        list.shutdown();
        position.acquireUninterruptibly(2);
        System.out.println("使用完毕，需要清扫了");
        position.release(2);
    }
}