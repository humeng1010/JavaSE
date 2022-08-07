package day02.d2OOP.d1_static;

/**
 * 理解static修饰成员变量的作用和访问特点
 * static是静态的意思，可以修饰成员变量，表示该成员变量只在内存中存储一份，可以被共享访问、修改。
 */
public class StaticFieldDemo1 {
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(18);
        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        User.onlineNumber++;
        System.out.println(User.onlineNumber);

        User user2 = new User();
        user2.setName("张三");
        user2.setAge(18);
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
        User.onlineNumber++;
        System.out.println(User.onlineNumber);
    }
}
