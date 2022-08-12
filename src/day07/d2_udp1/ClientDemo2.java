package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 客户端向服务端发数据
 */
public class ClientDemo2 {
    public static void main(String[] args) throws Exception {
//       发送端对象
        DatagramSocket socket = new DatagramSocket();

        byte[] buffer = "你好呀".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8889);

        socket.send(packet);
        socket.close();


    }
}
