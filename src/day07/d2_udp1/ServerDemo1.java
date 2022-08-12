package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 服务端接收数据
 */
public class ServerDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        String s = new String(packet.getData(), 0, packet.getLength());
        System.out.println(s);

        socket.close();
    }
}
