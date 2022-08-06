package day01;

public class D11_method {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "小白";
        System.out.println(cat.name + " " + cat);
        test(cat);
        System.out.println(cat.name + " " + cat);
    }

    public static void test(Cat cat) {
        System.out.println(cat.name + " " + cat);
        cat = new Cat();
        cat.name = "小黑";
        System.out.println(cat.name + " " + cat);

    }
}
