package ua.ua.sjerra.book.numbers;

/**
 * Created by Natalya on 31.05.2015.
 */
public class StaticTest extends  StaticSuper{
    static int rand;

    static {
        rand = (int) (Math.random()*6);
        System.out.println("Static block " + rand);
    }

    StaticTest(){
        System.out.println("StaticTest");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticTest ts = new StaticTest();

    }
}
