package day01;

import java.util.Random;
import java.util.Scanner;

public class D08_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("原先的数组为");
        for (int i : arr) {
            System.out.print(i + " ");
        }
//        打乱顺序
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        System.out.println("\n打乱后数组为");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
