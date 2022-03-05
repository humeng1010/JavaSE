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

