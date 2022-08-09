package day03.d7_arrays;

import java.util.Arrays;
import java.util.Locale;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 55, 22, 33, 44};
        System.out.println(arr);
//        返回数组内容
        String s = Arrays.toString(arr);
        System.out.println(s);
//        排序默认升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        二分搜索(前提必须排序) 如果没有查到则返回负数
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 44));

    }
}
