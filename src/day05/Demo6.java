package day05;

import java.io.FileWriter;
import java.util.Properties;


public class Demo6 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("admin", "root");
        properties.setProperty("password", "123456");
//        System.out.println(properties);
        /**
         * 参数一：保存管道
         * 参数二：保存心得注释
         */
        properties.store(new FileWriter("src/application.properties"), "this is user");
    }
}
