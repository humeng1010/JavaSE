package day01.d1type;

import java.util.Random;
import java.util.Scanner;

public class D03_random {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(100) + 1;//1-100
        System.out.println("请输入数字");
        num(r);

    }

    public static void num(int random) {
        Scanner scanner = new Scanner(System.in);
//        判断输入的是否为数字
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            while (num != random) {
                String msg = "猜错了哦,";
                if (num > random) {
                    msg += "有点大";
                } else {
                    msg += "有点小";
                }
                System.out.println(msg);
                num = scanner.nextInt();
            }
            System.out.println("猜对啦");
        } else {
            System.out.println("请输入数字");
            num(random);
        }


    }

}
