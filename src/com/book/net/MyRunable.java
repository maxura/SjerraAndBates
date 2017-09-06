package com.book.net;

/**
 * Created by maxura on 27.01.2016.
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("Steck vertex");
    }

}
