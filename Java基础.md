# Java基础

## 注释

1. Java的注释非常重要，注释就是 程序员 写给 程序员 看的给程序的解释

2. 注释并不会被执行，是给我们写代码的人看的

3. **书写注释是一个非常好的习惯**

4. java中的注释有三种：

   1. 单行注释

      >
      >
      >```java
      >public class HelloWorld {
      >    public static void main(String[] args) {
      >        System.out.println("HelloWorld!");//这是一段单行注释
      >    }
      >}
      >
      >```

   2. 多行注释

      >
      >
      >```java
      >public class HelloWorld {
      >    public static void main(String[] args) {
      >      /*
      >      这个
      >      里面
      >      可以
      >      写
      >      多行
      >      注释
      >      哟
      >      */
      >        System.out.println("HelloWorld!");
      >    }
      >}
      >
      >```

   3. 文档注释

      >
      >
      >```java
      >public class HelloWorld {
      >  /**
      >  * 这个里面可以写文档的注释
      >  * @Description HelloWorld（描述）
      >  * @Author （作者）
      >  */
      >    public static void main(String[] args) {
      >        System.out.println("HelloWorld!");
      >    }
      >}
      >
      >```
      >
      >



# 标识符

Java中的所有组成部分都需要名字，类名，变量名，方法名都被称为标识符

1. Java中的关键字不能作为标识符（就是关键字不能作为名字）

   ![img](https://raw.githubusercontent.com/redyouzi/images-for-blog/main/img02/202208061626156.png)

# 数据类型

### Java是强类型语言

要求变量的使用严格符合类型规定，所有的变量必须先定义后才能使用

### 数据类型

Java的数据类型分为两大类：基本类型和引用类型

Java语言类型：

​						基本类型：

​										数值类型：整数型，浮点型

​										boolean类型：占一位其值只有ture和false两个

​						引用数据类型：**类，接口，数组**（注意：字符串类型也是一个类，也属于引用数据类型）

### 整型拓展

```java
十进制整数，如：99, -500, 0。
八进制整数，要求以 0 开头，如：015。 
十六进制数，要求 0x 或 0X 开头，如：0x15 。
  
//整型 
int i=10; 
int i2=010; 
int i3=0x10; 
System.out.println(i); //10 System.out.println(i2); //8 System.out.println(i3); //16
```

### 字符型拓展

单引号用来表示字符常量。例如'A'是一个字符，他与"A"是不同的，"A"表示的是一个字符串。

```java
//代码1 
String sa=new String("Hello world"); 
String sb=new String("Hello world"); System.out.println(sa==sb); // false,因为sa与sb是通过String对象new出来的,创建了两个对象，而且sa和sb的地址也不一样，所以返回false
//代码2 
String sc="Hello world"; 
String sd="Hello world"; System.out.println(sc==sd); // true，因为创建的都是同一个对象，地址一样，内容也一样，所以返回true
```

### 布尔类型拓展

boolean类型：一位，不是一个字节，就是0或1

boolean类型有两个值，true和false，不可以用0或1代替true或false，这点和c语言不同

```JAVA
if(is == true && un == false){
  
}
if(is && !un){
  //是一样的，熟练的人应该使用下面的方式，代码要精简易读！
}
```

### 类型转换

因为Java是强类型的语言，所以有时候进行运算的时候，需要类型转换。

>低 ------------------------------------> 高 
>
>byte,short,char—> int —> long—> float —> double 

类型转换满足的规则：

- 不能对boolean类型进行类型转换
- 不能把对象类型转换成不相关类的对象
- 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
- 转换过程中可能导致溢出或损失精度
- 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入

### 自动类型转换

自动类型转换：容量小的数据类型可以自动转换为容量大的数据类型

byte,short,char是直接转换成int类型进行运算的

### 强制类型转换

```java
public static void main(String[] args) {
  double x = 3.14;
  int nx = (int)x; //值为3 
  char c = 'a'; 
  int d = c+1;
  System.out.println(d); //98 
  System.out.println((char)d); //b 
}
```

