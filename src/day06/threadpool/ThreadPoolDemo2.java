package day06.threadpool;

import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并测试其特性
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                6,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Future<String> submit1 = pool.submit(new MyCallable(100));
        Future<String> submit2 = pool.submit(new MyCallable(200));
        Future<String> submit3 = pool.submit(new MyCallable(300));
        Future<String> submit4 = pool.submit(new MyCallable(400));
        Future<String> submit5 = pool.submit(new MyCallable(500));
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());
        System.out.println(submit5.get());

    }
}
