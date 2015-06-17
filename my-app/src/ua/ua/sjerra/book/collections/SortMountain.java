package ua.sjerra.book.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by nata on 29.12.2014.
 */
public class SortMountain {
    LinkedList<Mointain> mtn = new LinkedList<Mointain>();

    class NameCompare implements Comparator<Mointain> {
        @Override
        public int compare(Mointain name1, Mointain name2) {
            return name1.getName().compareTo(name2.getName());
        }
    }

    class HeighCompare implements Comparator<Mointain> {
        @Override
        public int compare(Mointain heigh1, Mointain heigh2) {
            return heigh2.getHeigh() - heigh1.getHeigh();
        }
    }

    public static void main(String[] args) {
        new SortMountain().go();
    }

    public void go() {
        mtn.add(new Mointain("Long-ailend", 14255));
        mtn.add(new Mointain("Elbert", 14433));
        mtn.add(new Mointain("Maroon", 14156));
        mtn.add(new Mointain("Casle", 14265));
        System.out.println("In aadition order: \n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("For name: \n" + mtn);

        HeighCompare hc = new HeighCompare();
        Collections.sort(mtn, hc);
        System.out.println("For heigh: \n" + mtn);
    }
}
