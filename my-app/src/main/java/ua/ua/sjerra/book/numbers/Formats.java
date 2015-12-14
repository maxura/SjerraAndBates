package ua.ua.sjerra.book.numbers;

/**
 * Created by Natalya on 30.05.2015.
 */
public class Formats {
    static String form1 = "I need to restore %.2f erros ";
    static String form2 = "I need to restore % ,.2f erros ";

    public static void main(String[] args) {
        System.out.println(String.format(form1, 4765778.09876));
        System.out.println(String.format(form2, 4765778.09876));
    }
}
