package day06.thread_comunication;

/**
 * 了解线程通信
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account("ICBC-111", 0);

        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();

        new DepositThread(account, "亲爹").start();
        new DepositThread(account, "干爹").start();
        new DepositThread(account, "岳父").start();

    }
}
