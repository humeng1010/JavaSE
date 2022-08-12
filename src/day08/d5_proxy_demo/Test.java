package day08.d5_proxy_demo;

public class Test {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = UserServiceProxy.getProxy(userService);
//        登陆
        String loginResult = proxy.login("admin", "123456");
        System.out.println(loginResult);
//        删除
        boolean deleteResult = proxy.delete(2);
        System.out.println(deleteResult);
//        查询
        String selectResult = proxy.select("张三");
        System.out.println(selectResult);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
