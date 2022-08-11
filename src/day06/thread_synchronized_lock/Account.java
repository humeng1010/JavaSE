package day06.thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;//账户的余额
    //    final修饰的锁是 唯一不可替换
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 取钱-同步方法
     *
     * @param money
     */
    public void drawMoney(double money) {
//        先获取谁来取钱
        String name = Thread.currentThread().getName();
        lock.lock();//上锁
        try {
            //        判断账户余额够不够
            if (this.money >= money) {
                //            取钱
                System.out.println(name + "来取钱成功，取出" + money);
                //            更新余额
                this.money -= money;
                System.out.println(name + "取钱后剩余" + this.money);
            } else {
                //            余额不足
                System.out.println(name + "来取钱，余额不足");
            }
        } finally {
            lock.unlock();//解锁
        }
    }
}
