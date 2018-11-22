package com.thread.fork_join;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by wuxiang on 2018/11/17.
 *
 * RecursiveAction 使用 .awaitTermination(1, TimeUnit.SECONDS) 进行阻塞
 *
 * RecursiveTask
 *    .invoke() 会自动阻塞
 *    .submit() 不会自动阻塞，需要用 .isDone() 或者 .get() 来阻塞
 */
public class RecursiveTaskMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int arr[] = new int[100000];
        Random random = new Random();
        int total = 0;
        // 初始化100个数字元素
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(100);
            // 对数组元素赋值,并将数组元素的值添加到total总和中
            total += (arr[i] = temp);
        }
        System.out.println("初始化时的总和=" + total);

        // 创建包含Runtime.getRuntime().availableProcessors()返回值作为个数的并行线程的ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // 提交可分解的PrintTask任务
        ForkJoinTask<Integer> task = pool.submit(new RecursiveTaskDemo(arr, 0, arr.length));
        do {
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!task.isDone());

        System.out.println("计算出来的总和=" + task.get());

//        Integer integer = pool.invoke(new RecursiveTaskDemo(arr, 0, arr.length));
//        System.out.println("计算出来的总和=" + integer);

        // 关闭线程池
        pool.shutdown();
    }
}
