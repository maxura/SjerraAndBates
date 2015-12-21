package sjerra.book.numbers;

import java.util.Calendar;

/**
 * Created by Natalya on 31.05.2015.
 */
public class CalendarExamples {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(20015,0,7,15,40);
        System.out.println(c.get(c.HOUR_OF_DAY));
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
        c.setTimeInMillis(day1);
        System.out.println("New hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE,35);
        System.out.println("After adding 35 days " + c.getTime());
        c.roll(c.DATE,35);
        System.out.println("After rolling 35 days " + c.getTime());
        c.set(c.DATE,1);
        System.out.println("Set the date to 1 " + c.getTime());
    }

}
