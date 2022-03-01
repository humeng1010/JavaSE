# Java入门

# 1.安装开发环境



1. 访问官网https://www.oracle.com/java/technologies/downloads/

2. 选择对应的版本(推荐JDK8)，由于我是macOS Arm 64(M1)的系统，所以安装了适配于M1芯片的JDK-17

   ![](https://gitee.com/xiaohugitee/tuchuang/raw/master/202203012043222.png)

3. 打开终端配置Java的环境变量

   1. 输入：java -version，查看是否安装成功JDK（显示安装的JDK版本，就代表安装成功）

      ![](https://gitee.com/xiaohugitee/tuchuang/raw/master/202203012057058.png)

   2. 输入：/usr/libexec/java_home -V，查看JDK默认的安装地址

      ![](https://gitee.com/xiaohugitee/tuchuang/raw/master/202203012051358.png)

      

      复制下来最后一行的url地址备用

   3. 找到路径以后就是如何配置环境变量的问题，配置环境变量比较简单：

      需要修改两个文件

      第一个文件  .bash_profile ，使用如下命令修改：

      unix:bin bin$ cd ~ 进入到 **~** 目录

      unix:~ bin$ touch .bash_profile  创建一个配置文件

      unix:~ bin$ vi .bash_profile 使用vi编辑器编辑 .bash_profile文件

      然后输入  i  ,在vi编辑器里面输入 i  的意思是开始编辑。

      vi编辑器里面的内容如下:

       

      JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home

      CLASSPAHT=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

      PATH=$JAVA_HOME/bin:$PATH:

      export JAVA_HOME

      export CLASSPATH

      export PATH

       

      添加如上所示的语句就可以了，第一行代表的是jdk的路径，一定要记住选择到 Home 这个文件加下面；

      然后退出vi编辑器使用如下命令：

      1. 输入 ese 

      2. 输入冒号 : wq

      3. 保存退出 

      如果以上修改完毕切正确，那么接下来就是让配置的环境变量生效，使用如下命令：

      source .bash_profile 

4. 配置完成Java环境，接下来进入第二部分，下载我们的Java编译器。



# 2.安装IntelliJ IDEA

1. 打开官网：https://www.jetbrains.com/idea/

   ![](https://gitee.com/xiaohugitee/tuchuang/raw/master/202203012100364.png)

   ![截屏2022-02-22 下午5.22.33](/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.22.33.png)

2. 点击IntelliJ IDEA

   ![截屏2022-02-22 下午5.24.02](/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.24.02.png)

3. 选择Download，选择对应的版本下载（推荐下载专业版），接下来的事情就不必多说了，懂得都懂，网上有很多的视频。

4. 另外如果是M1芯片的用户可以选择这个下载（Apple Silicon）

   <img src="/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.27.22.png" alt="截屏2022-02-22 下午5.27.22" style="zoom:50%;" />

5. 下载安装好就来创建我们的第一个项目：HelloWorld！



# 3.编写我们的第一个程序HelloWorld

1. 打开我们提前准备好的存放代码的文件夹（也可以直接创建一个项目），然后在打开的文件夹中新建一个模版

   ![截屏2022-02-22 下午5.31.58](/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.31.58.png)

   2. 选择Java模版，这里编译器会自动检测到我们安装的Java环境，我们也可以在这里下载JDK，就不用去官网下载并且配置环境（经典白学)，这里我选择使用zulu-1.8的JDK，然后下一步，给项目起一个名字，就叫helloworld吧，然后完成

   <img src="/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.32.21.png" alt="截屏2022-02-22 下午5.32.21" style="zoom:50%;" />

   3. 展开刚刚新建的模版，然后新建一个Java类。

      ![截屏2022-02-22 下午5.33.03](/Users/humeng/blog-meng/blog-imgs/截屏2022-02-22 下午5.33.03.png)

   4. 类名就叫HelloWorld（类名首字母大写，并且遵循驼峰命名法）

   5. 编写HelloWorld（让程序输出HelloWorld），点击左边的绿色执行按钮

      ```java
      public class HelloWorld {
          public static void main(String[] args) {//psvm+回车
              System.out.println("HelloWorld!");//sout+回车
          }
      }
      
      ```

   6. 看到控制台成功输出HelloWorld!

   7. 恭喜你完成了Java入门，接下来让我们进入基础语法的学习吧

   

   

   

