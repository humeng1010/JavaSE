package day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/data.txt");
        InputStream fileInputStream = new FileInputStream(file);
        long length = file.length();
        byte[] buffer = new byte[(int) length];
        int len = fileInputStream.read(buffer);
//        System.out.println(Arrays.toString(buffer));
        System.out.println(new String(buffer));

    }
}
