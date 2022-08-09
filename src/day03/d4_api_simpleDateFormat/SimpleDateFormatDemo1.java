package day03.d4_api_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //格式化Date日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //        格式化时间毫秒值
        //        121秒后的时间
        long l = System.currentTimeMillis();
        l += 121 * 1000;
        String format1 = simpleDateFormat.format(l);
        System.out.println(format1);
        
        //解析字符串
        System.out.println("---------------");
        String d = "2022年08月09日10点13分15秒";
        //        创建一个简单日期格式化对象(参数要和被解析的字符串格式一样)
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        try {
            Date d1 = simpleDateFormat1.parse(d);
            System.out.println(d1);
            //            一天后
            long l1 = d1.getTime() + 24L * 60 * 60 * 1000;
            String format2 = simpleDateFormat1.format(l1);
            System.out.println(format2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
