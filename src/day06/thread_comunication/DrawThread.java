package day06.thread_comunication;

/**
 * 取钱线程
 */
public class DrawThread extends Thread {
    private Account account;

    public DrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
