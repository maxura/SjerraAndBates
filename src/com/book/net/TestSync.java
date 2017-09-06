package com.book.net;

/**
 * Created by maxura on 01.02.2016.
 */
public class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
           increment();
            System.out.println("The balance is equal: " + balance);

        }
    }
    public void increment(){
        int i = balance;
        balance = i+1;
    }


}