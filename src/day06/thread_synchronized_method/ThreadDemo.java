package day06.thread_synchronized_method;

/**
 * 模拟取钱案例
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        1.定义线程类，创建一个共享的账户类对象
        Account account = new Account("ACBC-111", 100000);
//        2.创建两个线程对象，代表小明和小红同时进来了
        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();

        Account account1 = new Account("BCBC-222", 100000);
        new DrawThread(account1, "小黑").start();
        new DrawThread(account1, "小白").start();

    }
}
