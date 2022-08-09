package day03.d8_sort_binarysearch;

import java.util.Arrays;
import java.util.Objects;

/**
 * 二分查找
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {22, 11, 44, 55, 88, 33, 99};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr, 33));

    }

    /**
     * 二分查找
     *
     * @param arr
     * @param data
     * @return 索引值
     */
    public static int binarySearch(int[] arr, int data) {
        if (Objects.isNull(arr)) return -1;
//        定义左右位置
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
//            取中间索引
            int middleIndex = (left + right) / 2;
//            判断当前中间位置的元素和要找的大小情况
            if (data > arr[middleIndex]) {
//                右查找
                left = middleIndex + 1;

            } else if (data < arr[middleIndex]) {
//                左查找
                right = middleIndex - 1;

            } else {
                return middleIndex;
            }
        }
//        没有这个元素
        return -1;
    }
}
