package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 服务端
 */
public class ServerDemo3 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        while (true) {
            socket.receive(packet);
            int length = packet.getLength();
            String rs = new String(buffer, 0, length);
            if ("exit".equals(rs)) {
                System.out.println("客户离线！");
                socket.close();
                break;
            }
            System.out.println("收到了来自:" + packet.getAddress() + "端口是:" + packet.getPort() + "的消息" + new String(buffer, 0, packet.getLength()));


        }
    }
}
