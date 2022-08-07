package day01.d2array;

import java.util.Arrays;
import java.util.Random;

public class D04_array {
    public static void main(String[] args) {
//        静态初始化数组
        double[] score = new double[]{99.6, 99, 50.3, 88.8};
        System.out.println(score);//[D@75b84c92 : [代表数组 D代表double 75b84c92代表16进制地址
        int[] age = new int[]{20, 19, 22, 23, 18};
        String[] names = {"牛爷爷", "胡图图", "胡英俊", "老王"};
        Random random = new Random();
        int i = random.nextInt(4);
        System.out.println(names[i]);
//        动态初始化数组
        int[] arr = new int[10];//定义的时候就规定好数组长度了 基本类型的如果没有赋值 默认为0或者0.0或者false 引用类型的不赋值则为null
        arr[0] = 99;
        arr[1] = 99;
        arr[2] = 99;
        arr[3] = 99;
        arr[9] = 99;
        arr[5] = 99;
        System.out.println(arr[3]);
        System.out.println(Arrays.toString(arr));

//        静态初始化和动态初始化时严格分开的不能混用的
    }
}
