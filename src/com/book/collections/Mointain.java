package com.book.collections;

/**
 * Created by nata on 29.12.2014.
 */
public class Mointain {
    private String name;
    private int heigh;

    Mointain(String name, int heigh) {
        this.name = name;
        this.heigh = heigh;
    }

    public String getName() {
        return name;
    }

    public int getHeigh() {
        return heigh;
    }

    @Override
    public String toString() {
        return name + " " + heigh;
    }
}
