package day02.d2OOP.d2_static_singleinstance;

public class Test01 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1 == s2);
    }
}
