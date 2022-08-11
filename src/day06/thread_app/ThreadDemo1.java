package day06.thread_app;

/**
 * 多线程的创建方式一:
 * 继承Thread类实现多线程
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
//        3.new一个新的线程对象
        Thread thread = new MyThread();
//        4.调用start方法启动线程
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程输出" + i);
        }

    }
}

/**
 * 1.定义一个线程类
 */
class MyThread extends Thread {
    /**
     * 2.重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
