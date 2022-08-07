package day01.d2array;

/**
 * 两个数组变量指向同一个数组对象
 * 总结:
 * 首先代码执行的的时候：
 * 1. 先由java编译.java文件为.class文件
 * 2. 方法区 会把.class文件中的main方法提取到 栈内存 中运行
 * 3. 栈内存依次执行代码 int[] arr1 先加载一个arr1变量区域 再 执行 {11, 22, 33} 其实new了一个数组对象放到堆内存中 并且把地址交给变量存储
 * 4. 把arr1的地址复制一份给arr2此时就是两个数组变量指向同一个数组对象
 * 5. 当我们修改任何一个其实修改的都是同一个对象，访问也同理
 */
public class D10_array {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;
//        输出
        System.out.println(arr1);
        System.out.println(arr2);
//        当我们更改arr2的第二个值的时候 发现两个数组变量的值都改变了
//        原因就是 int[] arr2 = arr1; 这行代码 引用类型的数据等号赋值传递的是地址 于是arr2的地址与arr1的地址一样，指向堆内存中的同一块区域

        arr2[1] = 99;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);

    }
}
