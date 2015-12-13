package ua.ua.sjerra.book.numbers;

/**
 * Created by Natalya on 01.06.2015.
 */
public class StaticSuper {
    static {
        System.out.println("Parent static block");
    }
    StaticSuper(){
        System.out.println("Parent constructor");
    }
}
