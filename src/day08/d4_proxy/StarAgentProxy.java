package day08.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    /**
     * 设计一个方法来返回一个明星对象的代理对象
     */
    public static Skill getProxy(Star star) {
        //为明星生成代理对象
        return (Skill) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收首款");
                        //让明星(被代理对象)跳舞唱歌
                        //method 正在调用的方法对象
                        //args 代表这个方法的参数
                        Object rs = method.invoke(star, args);
                        
                        System.out.println("收尾款");
                        return rs;
                    }
                });
    }
}
