package day05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
//        创建对象
        Student student = new Student("小张", 20, '男');

//        创建普通字节输出流
        FileOutputStream os = new FileOutputStream("src/obj.txt");
//        对象序列化:创建对象字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);
        System.out.println("序列化完成了");
        oos.close();
        os.close();

    }
}
