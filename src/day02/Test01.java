package day02;

import java.util.ArrayList;
import java.util.Scanner;

//两个对象内存分析
public class Test01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "宝马";
        car1.price = 50.88;
        System.out.println(car1.name);
        System.out.println(car1.price);
        car1.start();
        car1.run();

        Car car2 = new Car();
        car2.name = "奔驰";
        car2.price = 60;
        System.out.println(car2.name);
        System.out.println(car2.price);
        car2.start();
        car2.run();
    }
}
