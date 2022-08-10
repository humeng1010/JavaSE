package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) throws Exception {

        try (FileInputStream is = new FileInputStream("/Users/humeng/Pictures/截屏2022-08-10 13.13.39.png");
             FileOutputStream os = new FileOutputStream("/Users/humeng/Pictures/new.png")
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("copy success");
//            os.close();
//            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
