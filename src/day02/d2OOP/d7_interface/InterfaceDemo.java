package day02.d2OOP.d7_interface;

/**
 * 声明一个接口：体现一种规范，规范一定是公开的
 */
public interface InterfaceDemo {
    //    JDK8之前，接口中只能有常量和抽象方法
    //    常量
    public static final String SCHOOL_NAME = "黑马程序员";
    //    默认是常量
    String LOCATION = "深圳";

    //    抽象方法
//    public abstract void run();
    void run();

    //    默认是公开抽象的
    void eat();

}
