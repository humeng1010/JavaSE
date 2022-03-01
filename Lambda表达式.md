# Lambda表达式

## Lambda概述

Lambda表达式是JDK8开始后的一种新语法形式。

**作用：简化 匿名内部类（面向对象中的内容）的代码写法**

Lambda表达式的简化格式：

(匿名内部类被重写方法的形参列表) ->{

被重写方法的方法体代码。

}

注：->是语法形式，无实际含义。



**注意：**Lambda表达式只能简化函数式接口的匿名内部类的写法形式。

什么是函数式接口？

首先必须是接口、其次接口中有且仅有一个抽象方法的形式；

通常我们会在接口上加一个@FunctionalInterface注解，标记该接口必须满足函数式接口。

```java
package com.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Lambda表达式简化匿名内部类
        //Lambda表达式只能简化接口中只有一个抽象方法的匿名内部类形式

        //普通的匿名内部类
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游的很快");
            }
        };
        go(s1);

        //简化（因为这个Swimming接口中只有一个抽象方法，所以不会产生二义性）
        Swimming s2 = ()->{
            System.out.println("老师游泳很很很块");
        };
        go(s2);

        //再进一步简化
        go(()->{
            System.out.println("老师游泳游得超过了光速！！");
        });


    }
    public static void go(Swimming s){
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}

@FunctionalInterface//一旦加上这个注解，这个接口就必须是函数式接口，里面只能有一个抽象方法。
interface Swimming{
    void swim();
}

```

### 总结：

1. Lambda表达式的基本作用

   简化函数式接口的匿名内部类的写法

2. Lambda表达式有什么使用前提？

   必须是接口的匿名内部类，接口中只能有一个抽象方法

3. Lambda的好处

   Lambda是一个匿名函数，我们可以把Lambda表达式理解为是一段可传递的代码，它可以写出更简洁、灵活的代码，作为一种更紧凑的代码风格，使Java语言表达能力得到了提升。



Lambda表达式省略写法（在Lambda基础上继续简化）

- 参数类型可以省略不写

- 如果只有一个参数，参数类型可以省略，同时（）也可以省略
- 如果Lambda方法体重只有一行代码，可以省略大括号不写，同时也要省略分号
- 如果Lambda方法体重只有一行代码，可以省略大括号不写，如果这行代码是return语句，必须省略return不写，同时也要省略；不写

```java
package com.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer[] ages1 = {34,12,42,23};
//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;//降序：o2 - o1;  升序：o1 - o2;
//            }
//        });
            //简化
//        Arrays.sort(ages1,(Integer o1,Integer o2) -> {
//            return o2 - o1;
//        });
//          再简化！！
//        Arrays.sort(ages1,((o1, o2) -> {
//            return o2 - o1;
//        }));
        //再再再简化！！！
        Arrays.sort(ages1,(o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(ages1));



    }
}

```



