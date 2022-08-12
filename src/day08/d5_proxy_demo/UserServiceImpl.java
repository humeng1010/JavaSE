package day08.d5_proxy_demo;

public class UserServiceImpl implements UserService {

    @Override
    public String login(String name, String password) {
        System.out.println("登陆中...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if ("admin".equals(name) && "123456".equals(password)) {
            System.out.println("账户密码正确");
            return "登陆成功";
        }
        return "账户/密码错误，登陆失败";
    }

    @Override
    public boolean delete(int id) {
        System.out.println("正在删除" + id + "中...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (id > 0 && id < 10) {
            System.out.println("删除成功");
            return true;
        }
        System.out.println("删除失败");
        return false;
    }

    @Override
    public String select(String query) {
        System.out.println("正在为你查询" + query + "中...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return query;
    }
}
