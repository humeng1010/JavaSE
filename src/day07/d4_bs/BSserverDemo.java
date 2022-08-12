package day07.d4_bs;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 模拟BS架构
 */
public class BSserverDemo {
    //    创建线程池
    public static ExecutorService pool = new ThreadPoolExecutor(3,
            5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8080);
            while (true) {
                Socket accept = socket.accept();
                pool.execute(new ServerReadRunnable(accept));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

