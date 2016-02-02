package ua.sjerra.book.net;

/**
 * Created by maxura on 01.02.2016.
 */
public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job  =  new TestSync();
        Thread a  = new Thread(job);
        Thread b  = new Thread(job);
        a.start();
        b.start();
    }
}
