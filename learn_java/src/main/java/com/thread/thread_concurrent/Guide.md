1. concurrent.Executors 线程池
    
    * newFixedThreadPool（固定大小线程池）
    
    * newCachedThreadPool（无界线程池，可以进行自动线程回收）
    
    * newSingleThreadExecutor（单个后台线程）

2. Semaphore 信号量

3. ReentrantLock  可重入的互斥锁

4. BlockingQueue 有序的阻塞队列

5. CompletionService 将生产新的异步任务与使用已完成任务的结果分离开来的服务。

6. CountDownLatch 一个同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待。

7. CyclicBarrier 一个同步辅助类，它允许一组线程互相等待，直到到达某个公共屏障点 (common barrier point)

8. ScheduledExecutorService  可安排在给定的延迟后运行或定期执行的命令。