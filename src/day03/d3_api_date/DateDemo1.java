package day03.d3_api_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        date对象
        Date date = new Date();
        System.out.println(date);
//        获取时间毫秒值
//        System.out.println(date.getTime());
        long time = date.getTime();
        time += (60 * 60 + 121) * 1000;
        date.setTime(time);
        System.out.println(date);
    }
}
