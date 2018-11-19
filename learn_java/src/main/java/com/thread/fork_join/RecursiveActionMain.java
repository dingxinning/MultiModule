package com.thread.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuxiang on 2018/11/17.
 */
public class RecursiveActionMain {
    public static void main(String[] args) throws InterruptedException {
        // 创建包含Runtime.getRuntime().availableProcessors()返回值作为个数的并行线程的ForkJoinPool
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // 提交可分解的PrintTask任务
        forkJoinPool.submit(new RecursiveActionDemo(0, 1000));

        // 阻塞当前线程直到 ForkJoinPool 中所有的任务都执行结束
        forkJoinPool.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("结束");

        // 关闭线程池
        forkJoinPool.shutdown();
    }
}
