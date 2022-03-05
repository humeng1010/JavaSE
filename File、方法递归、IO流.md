# 学习思路

1. 先要定位文件
   - File类可以定位文件：进行删除、获取文本本身信息等操作
   - **但是不能读写文件**
2. 读写文件数据
   - IO流技术可以对硬盘中的文件进行读写
3. 总体学习思路
   - 先学会使用File类定位文件以及操作文件本身
   - 然后学习IO流读写文件数据



# File类概述

- File类在包java.io.File下、代表操作系统的文件对象（文件、文件夹）
- File类提供了诸如：定位文件，获取文件本身的信息、删除文件、创建文件（文件夹）等功能。

| 方法                                     | 说明                                                  |
| ---------------------------------------- | ----------------------------------------------------- |
| public File (String pathname)            | 根据文件路径创建文件对象                              |
| public File (String parent,String child) | 从父路径名 字符串和 子路径 字符串 创建对象            |
| public File (File parent,String child)   | 根据父路径对应的文件对象和子路径名 字符串创建文件对象 |

```java
package com.memg;

import java.io.File;

/**
 * 学会创建File对象，定位操作系统的文件对象
 */
public class FileDemo1 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("/Users/humeng/Pictures/2022.03.01.10.14.jpg");
        long length = f.length();
        System.out.println(length);
        System.out.println(f.getName());
        //file创建对象，支持绝对路径，支持相对路径
        //相对路径：一般是定位我们模块中的文件
        File f2 = new File("src/data.txt");
        System.out.println(f2.length());

        //判断路径是否存在
        File f3 = new File("/Users/humeng/Downloads");
        System.out.println(f3.isDirectory());//判断文件夹是否存在
        System.out.println(f3.exists());//判断路径是否存在


    }
}

```



# File类常用API

## 判断文件类型、获取文件信息

| 方法                            | 说明                                     |
| ------------------------------- | ---------------------------------------- |
| public boolean isDirectory()    | 测试此抽象路径表示的是File是否问文件夹   |
| public boolean isFile()         | 测试此抽象路径表示的是File是否问文件     |
| public boolean exists()         | 测试此抽象路径表示的是File是否存在       |
| public String getAbsolutePath() | 返回此抽象路径名的绝对路径名字符串       |
| public String getPath()         | 将此抽象路径名装换为路径名字符串         |
| public String getName()         | 返回由此抽象路径名表示的文件或文件夹名称 |
| public long lastModified()      | 返回文件最后修改的时间毫秒值             |

```java
package com.memg;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        //1、绝对路径创建一个文件对象
        File file = new File("src/data.txt");
        //2、获取它的绝对路径
        System.out.println(file.getAbsolutePath());
        //3、获取文件定义的时候使用的路径
        System.out.println(file.getPath());
        //4、获取文件名称，带后缀
        System.out.println(file.getName());
        //5、获取文件大小：字节个数
        System.out.println(file.length());
        //6、获取文件最后修改时间；时间毫秒值
        long time = file.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));//格式化时间
        //7、判断文件是文件还是文件夹
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}

```



## 创建文件、删除文件功能

### File创建文件的功能

| 方法                           | 说明                   |
| ------------------------------ | ---------------------- |
| public boolean createNewFile() | 创建一个新的空的文件夹 |
| public boolean mkdir()         | 只能创建一级文件夹     |
| public boolean mkdirs()        | 可以创建多级文件夹     |

### File类删除文件夹的功能

| 方法                    | 说明                                   |
| ----------------------- | -------------------------------------- |
| public boolean delete() | 删除由此抽象路径名表示的文件或空文件夹 |

- delete方法直接删除不走回收站；如果删除的是一个文件，且文件没有被占用则直接被删除
- delete方法默认只能删除空文件夹



```java
package com.memg;

import java.io.File;
import java.io.IOException;

/**
 * 学会创建File对象，定位操作系统的文件对象
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File f = new File("src/data.txt");
        //创建文件
        System.out.println(f.createNewFile());//已存在文件，返回false
        //
        File f2 = new File("src/data2.txt");
        System.out.println(f2.createNewFile());//创建文件几乎不用，因为后面文件都是自动创建的，IO流写文件自动创建

        //mkdir 创建一级目录
        File file = new File("/Users/humeng/aaa");
        //System.out.println(file.mkdir());

        //mkdirs创建多级目录
        //File file1 = new File("/Users/humeng/aaa/bbb/ccc");
        //System.out.println(file1.mkdirs());

        //删除,只能删除空文件夹或文件
        System.out.println("--------");
        System.out.println(f2.delete());
        System.out.println(file.delete());
        
        File f3 = new File("/Users/humeng/aaa");
        System.out.println(f3.delete());


    }
}

```



## 遍历文件夹

| 方法                           | 说明                                                         |
| ------------------------------ | ------------------------------------------------------------ |
| public String[] list()         | 获取当前目录下的所有的”一级文件夹名称“到一个字符串数组中去返回 |
| public File[] listFile()  常用 | 获取当前目录下的所有的”一级文件夹**对象**“到一个文件对象数组中去返回（重点） |



### 注意事项

- 当调用者不存在时，返回null
- 当调用者是一个文件时，返回null
- 当调用者是一个空文件夹时，返回一个长度为0的数组
- 当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
- 当调用者是一个有隐藏文件的文件夹时，将里面的所有文件和文件夹的路径放在File数组中返回，包含隐藏内容
- 当调用者是一个需要权限才能进入的文件夹时，返回null

```java
package com.memg;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("/Users/humeng/Pictures");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
//            file1.delete();会删除照片下的一级文件对象的，不要打开！！
        }
    }
}

```



# 方法递归

## 递归的形式和特点

什么是方法递归？

- 方法直接调用自己或者简介调用自己的形式成为方法递归（recursion）
- 递归作为一种<u>算法</u>在<u>程序设计语言</u>中广泛应用

## 递归的形式

- 直接递归：方法自己调用自己
- 简介递归：方法调用其他方法，其他方法又回调方法自己