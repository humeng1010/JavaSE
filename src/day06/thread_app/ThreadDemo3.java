package day06.thread_app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方式三:
 * 实现Callable接口，结合FutureTask完成
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
//        3.创建Callable任务对象
        Callable<String> callable = new MyCallable(100);
//        4.把Callable任务对象 交给FutureTask 对象
//        FutureTask的作用：是Runnable的对象(实现了Runnable接口) 可以交给Thread线程了 可以在线程执行完毕之后调用get方法获取到执行的结果
        FutureTask<String> task = new FutureTask<>(callable);
//        5.交给线程处理
        Thread thread = new Thread(task);
//        6.启动线程
        thread.start();

//        再启动一个线程
        Callable<String> callable1 = new MyCallable(200);
        FutureTask<String> task1 = new FutureTask<>(callable1);
        Thread thread1 = new Thread(task1);
        thread1.start();

        try {
            String s = task.get();
            System.out.println("第一个结果" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String s = task1.get();
            System.out.println("第二个结果" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 1.定义一个任务类 实现Callable接口并规定返回结果的类型
 */
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 2.重写call方法
     *
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果是" + sum;
    }
}
