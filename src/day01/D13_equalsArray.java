package day01;

import java.util.Arrays;

public class D13_equalsArray {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {11, 22, 33};
        System.out.println(equalsArray(arr1, arr2));

    }

    public static boolean equalsArray(int[] arr1, int[] arr2) {
        if (arr1 == arr2)
            return true;
        if (arr1 == null || arr2 == null)
            return false;

        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }
}
