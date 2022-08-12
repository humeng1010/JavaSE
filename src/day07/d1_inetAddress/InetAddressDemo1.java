package day07.d1_inetAddress;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getLocalHost();
//        System.out.println(ip1);
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
//        System.out.println(ip2);
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
    }
}
