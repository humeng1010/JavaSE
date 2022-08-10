package day05;

import java.io.FileReader;
import java.util.Properties;

public class Demo7 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        System.out.println(properties);
        properties.load(new FileReader("src/application.properties"));
        System.out.println(properties);
        String admin = properties.getProperty("admin");
        System.out.println(admin);
    }
}
