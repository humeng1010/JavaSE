package day08.d4_proxy;

/**
 * 开发出一个动态代理对象出来，理解动态代理的执行流程
 */
public class Test {
    public static void main(String[] args) {
//        1.创建一个类对象，对象的类必须实现接口
        Star star = new Star("明星");
//        为明星对象生成一个代理对象
        Skill star2 = StarAgentProxy.getProxy(star);
        star2.jump();//走代理
        star2.sing();

    }
}
