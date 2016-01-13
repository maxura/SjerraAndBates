package sjerra.book.graphic;

/**
 * Created by nata on 12.02.2015.
 */
public class Outer {
    private int x;
    MyInner inner = new MyInner();

    public void doStuff() {
        inner.go();
    }

    class MyInner {
        void go() {
            x = 42;
        }
    }
}
