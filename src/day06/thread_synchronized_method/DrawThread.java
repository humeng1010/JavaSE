package day06.thread_synchronized_method;

/**
 * 取钱的线程
 */
public class DrawThread extends Thread {
    //    线程类接收处理的账户对象
    private Account account;

    public DrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }


    @Override
    public void run() {
//        取钱
        account.drawMoney(100000);
    }
}
