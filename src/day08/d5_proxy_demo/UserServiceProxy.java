package day08.d5_proxy_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxy {
    public static <T> T getProxy(T obj) {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long before = System.currentTimeMillis();

                Object rs = method.invoke(obj, args);

                long after = System.currentTimeMillis();
                long time = after - before;
                System.out.println("执行" + method.getName() + "方法花费了" + time + "ms");
                return rs;
            }
        });

    }
}
