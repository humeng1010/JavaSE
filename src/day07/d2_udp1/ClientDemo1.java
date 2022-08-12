package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * 发送端
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
//        1.创建发送端对象
        DatagramSocket socket = new DatagramSocket();
//        2.发送的数据
        byte[] buffer = "hello小韭菜".getBytes(StandardCharsets.UTF_8);
//        3.创建一个数据包对象
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
//        4.发送数据
        socket.send(packet);

        socket.close();
    }
}
