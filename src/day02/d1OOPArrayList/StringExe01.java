package day02.d1OOPArrayList;

import java.util.Random;

public class StringExe01 {
    public static void main(String[] args) {
        System.out.println(getStr(4));


    }

    public static String getStr(int num) {
        String str = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder verification = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int r = random.nextInt(37);
            char c = str.charAt(r);
            verification.append(c);
        }
        return verification.toString();
    }
}
