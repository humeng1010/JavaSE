package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * 接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
//        1.创建接收端对象
        DatagramSocket socket = new DatagramSocket(8889);
//        2.创建数据包对象，接收数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
//        3.等待接收数据
        socket.receive(packet);

//        4.取出数据
        String s = new String(buffer, 0, packet.getLength());
        System.out.println("收到数据:" + s);

        socket.close();

    }
}
