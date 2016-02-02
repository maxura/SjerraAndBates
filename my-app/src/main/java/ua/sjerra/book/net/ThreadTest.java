package ua.sjerra.book.net;

/**
 * Created by maxura on 27.01.2016.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <20; i++) {
            Runnable threadJob = new MyRunable();
            Thread myThread = new Thread(threadJob);
            myThread.start();
            Thread.sleep(100);
            System.out.println("Return to main");

        }

    }
}
