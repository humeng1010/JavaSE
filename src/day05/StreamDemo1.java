package day05;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 认识Stream流对集合的操作
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张小三", "张三丰", "王老五", "张狗蛋", "王狗蛋", "张三");
        System.out.println(names);
//        姓张的集合 且三个字的
//        ArrayList<String> zhang = new ArrayList<>();
//        names.forEach((name) -> {
//            if (name.startsWith("张") && name.length() == 3)
//                zhang.add(name);
//        });
//        System.out.println(zhang);

//        Stream流
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
