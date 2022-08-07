package day01;

import java.util.Arrays;
import java.util.Objects;

public class D12_printArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        if (!Objects.isNull(arr)) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }
    }
}
