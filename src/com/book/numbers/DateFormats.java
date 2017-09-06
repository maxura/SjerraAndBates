package com.book.numbers;

import java.util.Date;

/**
 * Created by Natalya on 31.05.2015.
 */
public class DateFormats {
    public static void main(String[] args) {
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%ta, %tb, %td", new Date(),new Date(),new Date()));
        System.out.println(String.format("%ta, %<tb, %<td", new Date()));
    }
}
