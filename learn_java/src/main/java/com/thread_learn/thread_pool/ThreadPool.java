package com.thread_learn.thread_pool;

import com.thread_learn.blocking_queue.BlockingQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 24. 线程池
 */
public class ThreadPool {
    private BlockingQueue taskQueue = null;
    private List<PoolThread> threads = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int noOfThreads, int maxNoOfTasks) {

        // 任务被插入一个阻塞队列中
        taskQueue = new BlockingQueue(maxNoOfTasks);

        // 线程池中的线程，从阻塞队列中取任务，然后去执行
        for (int i = 0; i < noOfThreads; i++) {
            threads.add(new PoolThread(taskQueue));
        }
        for (PoolThread thread : threads) {
            thread.start();
        }
    }

    public synchronized void execute(Runnable task) throws Exception {
        if (this.isStopped) throw new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.enqueue(task);
    }

    public synchronized void stop() {
        this.isStopped = true;
        for (PoolThread thread : threads) {
            thread.doStop();
        }
    }
}
