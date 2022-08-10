package day05;

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("src/data.txt");

//        定义一个桶存储字节
        byte[] buffer = new byte[3];
//        定义长度用于存储桶中有几个字节数据
        int len;
        while ((len = is.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }


    }
}
