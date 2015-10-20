package ua.sjerra.book.graphic;

/**
 * Created by nata on 12.02.2015.
 */
public class Foo {
    public static void main(String[] args) {
        Outer innerClass = new Outer();
        Outer.MyInner innerObj = new Outer().new MyInner();
    }
}
