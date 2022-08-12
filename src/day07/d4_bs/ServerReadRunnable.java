package day07.d4_bs;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReadRunnable implements Runnable {

    private Socket socket;

    public ServerReadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            printStream.println("HTTP/1.1 200 OK");
            printStream.println("Content-Type:text/html;charset=UTF-8");
            printStream.println();//必须换行才可以响应
            printStream.println("<h1>hello我的</h1>");
            printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
