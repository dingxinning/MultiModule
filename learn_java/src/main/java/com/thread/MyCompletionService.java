package com.thread;

import java.util.concurrent.*;

/**
 * Created by Wuxiang on 2017/9/28.
 * 5. CompletionService 将生产新的异步任务与使用已完成任务的结果分离开来的服务。
 *
 * 生产者 submit 执行的任务，使用者 take 已完成的任务。
 * 并按照完成这些任务的顺序处理它们的结果。
 */
public class MyCompletionService implements Callable<String> {
    private int id;

    public MyCompletionService(int i) {
        this.id = i;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        CompletionService<String> completion = new ExecutorCompletionService<String>(service);
        for (int i = 0; i < 10; i++) {
            completion.submit(new MyCompletionService(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(completion.take().get());
        }
        service.shutdown();
    }

    public String call() throws Exception {
        Integer time = (int) (Math.random() * 1000);
        try {
            System.out.println(this.id + " start");
            Thread.sleep(time);
            System.out.println(this.id + " end");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.id + ":" + time;
    }
}
