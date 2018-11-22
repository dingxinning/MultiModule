package com.thread.thread_learn.thread_pool;

import com.thread.thread_learn.blocking_queue.BlockingQueue;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 24. 线程池
 *
 * 线程池中的线程
 */
public class PoolThread extends Thread {
    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;

    public PoolThread(BlockingQueue queue) {
        taskQueue = queue;
    }

    @Override
    public void run() {
        while (!isStopped()) {
            try {
                Runnable runnable = (Runnable) taskQueue.dequeue();
                runnable.run();
            } catch (Exception e) {
                // 写日志或者报告异常,
                // 但保持 PoolThread 运行.
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;
        this.interrupt(); // 打断 PoolThread 的 dequeue() 调用.
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }
}
