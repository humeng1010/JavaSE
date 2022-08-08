package day03.d2_api_Objects;

import java.util.Objects;

/**
 * 掌握Objects类常用的方法
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("id");
//        String类重写了equals和toString
//        System.out.println(s1.equals(s2)); // 可能出现空指针异常
        System.out.println(Objects.equals(s1, s2));//false
        System.out.println(Objects.isNull(s1));//true

    }
}
