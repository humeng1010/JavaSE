package day03.d5_api_calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
//        获取日历实例
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
//        获取年
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
//        获取月 (从0开始 注意要加一)
        int month = instance.get(Calendar.MONTH) + 1;
        System.out.println(month);
//        获取一年中的第几天
        int day = instance.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);
//        加或减
        instance.add(Calendar.DAY_OF_YEAR, 64);
        Date time = instance.getTime();
        System.out.println(time);
    }
}
