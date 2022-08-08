package day02.d2OOP.d5_enum;

public class Test {
    public static void main(String[] args) {
        test(Season.WINTER);
    }

    public static void test(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

    }
}
