package com.thread.fork_join.fibonacci;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;

/**
 * Created by wuxiang on 2018/11/19 18:38
 */
public class TestFibonacci {

    @org.junit.Test
    public void testFibonacci() throws InterruptedException, ExecutionException {
        ForkJoinTask<Integer> fjt = new Fibonacci(45);
        ForkJoinPool fjpool = new ForkJoinPool();
        Future<Integer> result = fjpool.submit(fjt);

        // do something
        System.out.println(result.get());
    }

}
