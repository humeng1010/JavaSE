package day01;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class D09_arraySort {
    public static void main(String[] args) {
        /**
         * 5 4 3 2 1
         * 第一轮(比较4次)
         * 4 5 3 2 1
         * 4 3 5 2 1
         * 4 3 2 5 1
         * 4 3 2 1 5
         * 第二轮(比较3次)
         * 3 4 2 1 5
         * 3 2 4 1 5
         * 3 2 1 4 5
         * 第三轮(比较2次)
         * 2 3 1 4 5
         * 2 1 3 4 5
         * 第四轮(比较1次)
         * 1 2 3 4 5
         *
         * 外层循环:arr.length - 1
         * 内层循环:arr.length - i - 1
         */
        int[] age = {20, 19, 18, 22, 21, 23};
//        int[] age = {5, 4, 3, 2, 1};
//        总共需要比较数组长度-1次 因为每次都会获取到一个最大值
        for (int i = 0; i < age.length - 1; i++) {
            for (int j = 0; j < age.length - i - 1; j++) {
                if (age[j] > age[j + 1]) {
                    int temp = age[j];
                    age[j] = age[j + 1];
                    age[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(age));
    }
}
