package day08.d1_junit;

import org.junit.Assert;
import org.junit.Test;

public class TestUserService {
    @Test
    public void testLoginName() {
        String rs = new UserService().loginName("admin", "123456");
        System.out.println(rs);
//        assert rs.equals("登陆成功");
        Assert.assertEquals("你的功能业务可能出现问题", "登陆成功", rs);
    }
}
