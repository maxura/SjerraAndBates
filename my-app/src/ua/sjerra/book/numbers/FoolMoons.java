package sjerra.book.numbers;

import java.util.Calendar;

/**
 * Created by Natalya on 01.06.2015.
 */
public class FoolMoons {
    static int DAY_IN = 1000*60*60*24;
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0,7,15,40);
        long day1 = c.getTimeInMillis();

        for (int i = 0; i < 60; i++) {
            day1+=(DAY_IN*29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("FoolMoon was in %tc", c));

        }
    }
}
