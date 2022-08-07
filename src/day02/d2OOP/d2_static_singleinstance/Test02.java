package day02.d2OOP.d2_static_singleinstance;

public class Test02 {
    public static void main(String[] args) {
        SingleInstance2 instance1 = SingleInstance2.getInstance();
        SingleInstance2 instance2 = SingleInstance2.getInstance();
        System.out.println(instance1 == instance2);
    }
}
