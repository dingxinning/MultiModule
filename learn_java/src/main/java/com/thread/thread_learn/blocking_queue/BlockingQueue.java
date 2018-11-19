package com.thread.thread_learn.blocking_queue;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Wuxiang on 2018/3/7
 *
 * 23. 阻塞队列
 *
 * 当队列是空的时，从队列中获取元素的操作将会被阻塞，或者当队列是满时，往队列里添加元素的操作会被阻塞。
 *
 * 阻塞队列的实现类似于带上限的Semaphore的实现。
 * 只有队列的大小等于上限（limit）或者下限（0）时，才调用notifyAll方法（调用notifyAll，可能会引起饥饿，没有保证公平性）
 */
public class BlockingQueue {
    private List<Object> queue = new LinkedList<>();
    private int limit = 10;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    // 往队列添加元素
    public synchronized void enqueue(Object item) throws InterruptedException {

        // 当队列已满的时候，等待
        while (this.queue.size() == this.limit) {
            wait();
        }

        // 当队列为空的时候，将所有线程全部唤醒
        if (this.queue.size() == 0) {
            notifyAll();
        }

        this.queue.add(item);
    }

    // 从队列获取元素
    public synchronized Object dequeue() throws InterruptedException {

        // 当队列为空的时候，等待
        while (this.queue.size() == 0) {
            wait();
        }

        // 当队列已满的时候，将所有线程全部唤醒
        if (this.queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.remove(0);
    }
}
