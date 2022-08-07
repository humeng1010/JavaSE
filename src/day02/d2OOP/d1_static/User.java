package day02.d2OOP.d1_static;

public class User {
    //    在线人数:static修饰的成员变量：静态成员变量，在内存中只有一份，可以被共享
    public static int onlineNumber;

    //    static静态代码块初始化静态变量
    static {
        onlineNumber = 0;
    }

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
