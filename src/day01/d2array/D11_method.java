package day01.d2array;

//方法参数传递机制：值传递
//基本类型的参数传输存储的：数据值
//引用类型的参数传输存储的：地址值
//主要看变量中存储的是什么 基本类型就是在栈内存中的 而引用类型是在堆内存中的，变量存储的是对象的地址
public class D11_method {
    public static void main(String[] args) {
//        基本类型
        int num = 22;
        changeNum(num);//传递的是num的值：22
        System.out.println(num);
        System.out.println("----------------------------");
//        引用类型
        int[] arr = new int[]{11, 22, 33};
        System.out.println("地址为" + arr);
        change(arr);//传递的是地址值：[I@75b84c92
        System.out.println(arr[1]);//222
        System.out.println("地址为" + arr);

    }

    public static void changeNum(int num) {
        System.out.println(num);
        num = 222;
        System.out.println(num);
    }

    public static void change(int[] arr) {
        System.out.println("地址为" + arr);
        System.out.println(arr[1]);//22
        arr[1] = 222;
        System.out.println(arr[1]);//222
        System.out.println("地址为" + arr);

    }
}
