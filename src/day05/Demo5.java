package day05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 对象的反序列化
 */
public class Demo5 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/obj.txt"));
        Student student = (Student) ois.readObject();
        System.out.println(student);
    }
}
