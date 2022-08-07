package day02.d1OOPArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class StringApiDemo01 {
    public static void main(String[] args) {
//        比较字符串
        String s1 = "ABCD";
        String s2 = "abcd";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-------------------------");

        String name = "我爱你China";
//        获取字符串的长度
        System.out.println(name.length());
//        获取某个索引位置处的字符串
        System.out.println(name.charAt(0));
//      遍历字符串
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("-------------------------");
//        把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
//        截取字符串包前不包后
        String substring = name.substring(0, 3);//我爱你
        System.out.println(substring);
//        从索引一直截取到结尾
        String substring1 = name.substring(3);//China
        System.out.println(substring1);
//        替换
        String replace = name.replace("China", "中国");
        System.out.println(replace);
//        System.out.println(name);
//        包含
        System.out.println(name.contains("China"));
//        以什么开始
        System.out.println(name.startsWith("我"));

//        以什么分割
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        String s = scanner.nextLine();//输入1,2,3,4,5(英文逗号分割)
        String[] split = s.split(",");
        System.out.println(Arrays.toString(split));


    }
}
