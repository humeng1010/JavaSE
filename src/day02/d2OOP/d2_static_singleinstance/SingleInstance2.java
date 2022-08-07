package day02.d2OOP.d2_static_singleinstance;

/**
 * 懒汉单例
 */
public class SingleInstance2 {
    /**
     * 2.静态成员变量用于存储静态成员变量 只加载一次 只有一次
     */
    private static SingleInstance2 singleInstance;

    /**
     * 1.私有构造器
     */
    private SingleInstance2() {

    }

    /**
     * 3.提供静态方法用于获取对象
     *
     * @return
     */
    public static SingleInstance2 getInstance() {
//        如果第一次来拿对象 则创建对象
        if (singleInstance == null)
            singleInstance = new SingleInstance2();
        return singleInstance;
    }
}
