package day02.d2OOP.d2_static_singleinstance;

/**
 * 使用饿汉单例实现单例类
 */
public class SingleInstance {


    /**
     * 饿汉单例是在对象获取之前，对象就已经准备好了
     */
    public static SingleInstance instance = new SingleInstance();

    /**
     * 私有构造器
     */
    private SingleInstance() {

    }
}
