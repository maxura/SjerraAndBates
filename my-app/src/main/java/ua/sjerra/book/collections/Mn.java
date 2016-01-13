package ua.sjerra.book.collections;

import java.net.MalformedURLException;

/**
 * Created by nata on 04.01.2015.
 */
public class Mn {
    public static void main(String[] args) throws MalformedURLException {
        String a = "feergtrt";
        String b="fwfferef";
        Gr gr = new Gr();
        Gr gr2 = gr;

        System.out.println(a.hashCode());
        System.out.println(gr2.hashCode());

    }
}
