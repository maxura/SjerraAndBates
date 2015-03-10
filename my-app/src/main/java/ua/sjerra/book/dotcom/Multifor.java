package ua.sjerra.book.dotcom;

import java.util.Random;

/**
 * Created by mmusienko on 3/2/15.
 */
public class Multifor {
    static int[][] arr = new int[10][10];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = new Random().nextInt(10);
            }
        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}