package day07.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientDemo3 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请发送:");
            String msg = scanner.nextLine();
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);
            socket.send(packet);
            
            if ("exit".equals(msg)) {
                System.out.println("你已退出客户端");
                socket.close();
                break;
            }
        }

    }
}
