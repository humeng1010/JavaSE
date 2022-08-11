package day06.thread_app;

/**
 * 创建线程方式二:
 * 实现Runnable接口
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
//        创建一个 任务对象
        Runnable runnable = new MyRunnable();
//        把任务对象交给线程对象处理
        Thread thread = new Thread(runnable);
//        启动线程
        thread.start();

//        使用匿名内部类实现多线程
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程2执行输出" + i);
            }
        }).start();


//      主线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程执行输出" + i);
        }


    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程1执行输出" + i);
        }
    }
}
