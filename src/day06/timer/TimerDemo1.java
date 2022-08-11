package day06.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时器的使用
 */
public class TimerDemo1 {
    public static void main(String[] args) {
//        创建Timer定时器
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次~~");
            }
        }, 0, 3000);
    }
}
