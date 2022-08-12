package day08.d1_junit;

public class UserService {
    public String loginName(String name, String password) {
        if ("admin".equals(name) && "123456".equals(password)) return "登陆成功";

        return "用户名或密码错误";
    }
}
