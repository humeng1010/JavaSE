package day06.threadpool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并测试其特性
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        /**
         * int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler
         */
        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                6,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Runnable runnable = new MyRunnable();
//        下面由三个核心线程进行处理
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
//        下面5个线程进入任务队列 当任务队列满了之后(大于5个)，则创建临时线程
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
//         创建了临时线程
        pool.execute(runnable);
        pool.execute(runnable);
//        不能创建，拒绝策略被触发
//        pool.execute(runnable);
//        关闭线程池
//        pool.shutdownNow();//立即执行 会丢失任务
//        pool.shutdown();//等待任务执行完毕后关闭
    }
}
