package day03.d6_regex;

/**
 * 正则表达式校验qq号
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("1234"));
        System.out.println(checkQQ("12345"));
        System.out.println(checkQQ("123456"));
        System.out.println(checkQQ("123456aa"));
        System.out.println(checkQQ(null));

    }

    public static boolean checkQQ(String qq) {
//        \d - 代表数字 {5,10} 5到10位
        return qq != null && qq.matches("\\d{5,10}");

    }
}
