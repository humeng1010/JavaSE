package day03.d6_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        String name = "小张akaksksa小王akdhahak大大";
//        正则表达式 以(数字英文下划线匹配至少一次)分割
        String[] split = name.split("\\w+");
        for (String s : split) {
            System.out.println(s);
        }
//        以空格替换所有的(数字英文下划线匹配至少一次)
        String replace = name.replaceAll("\\w+", " ");
        System.out.println(replace);
    }
}
