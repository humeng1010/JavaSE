package day03.d9_lambda;

import java.util.Arrays;

/**
 * 排序
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 6, 4, 5, 8, 3};
        Arrays.sort(arr, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));
    }
}
