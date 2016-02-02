package ua.sjerra.book.net;

/**
 * Created by maxura on 27.01.2016.
 */
class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

}

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithDrawal(10);
            if (account.getBalance() < 0) {
                System.out.println(" over limit!");
            }
        }
    }

    private void makeWithDrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() +  " going to get money");
            try {
                System.out.println(Thread.currentThread().getName() + "go to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " wake up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " end of transaction");
        }
        else{
           System.out.println("Sorry for client "+Thread.currentThread().getName() + " not enough money");
        }
    }
}



