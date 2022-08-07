package day01.d2array;

import java.util.Arrays;

/**
 * 数组求最值
 */
public class D07_array {
    public static void main(String[] args) {
        int[] arr = {100, 103, 99, 106, 98, 76};
        System.out.println(Arrays.toString(D07_array.maxInArr(arr)));
    }

    /**
     * @param arr
     * @return arr[0]:maxValue arr[1]:index
     */
    public static int[] maxInArr(int[] arr) {
        int[] result = new int[2];
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        result[0] = max;
        result[1] = index;
        return result;
    }
}
