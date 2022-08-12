package day07.d3_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 完成Socket网络编程入门案例：一发一收
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            printStream.print("hello你好呀服务端");

            printStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
