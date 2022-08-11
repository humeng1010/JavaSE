package day06.thread_comunication;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }


    /**
     * 父亲们存钱 同步方法
     * 亲爹 干爹 岳父 存钱
     *
     * @param money
     */
    public synchronized void depositMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money == 0) {
                //            存钱
                this.money += money;
                System.out.println(name + "存钱" + money + "成功！余额是:" + this.money);
                this.notifyAll();
                this.wait();

            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 孩子们取钱 同步方法
     * 小明和小红取钱
     *
     * @param money
     */
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                //            取钱
                this.money -= money;
                System.out.println(name + "来取钱" + money + "成功！余额是:" + this.money);
                //            唤醒正在此对象的监视器上等待的所有线程
                this.notifyAll();//唤醒所有线程
                this.wait();//让当前线程进入等待，并且释放占用的锁，直到另一个线程调用notify方法或者notifyAll方法
            } else {
//                钱不够,唤醒其他线程(期望唤醒父亲们存钱)
                this.notifyAll();
                this.wait();//让当前线程进入等待，并且释放占用的锁，直到另一个线程调用notify方法或者notifyAll方法
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


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


}
