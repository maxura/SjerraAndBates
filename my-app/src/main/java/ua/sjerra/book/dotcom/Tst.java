package ua.sjerra.book.dotcom;

import java.util.Scanner;

/**
 * Created by mmusienko on 2/27/15.
 */
public class Tst {
    public static void main(String[] args) {
        int arr[] = new int[7];
        int numOfGuesses = 0;
        int counter = 0;
        int userData = 0;
        int initNum = ((int) (Math.random() * 5));
        for (int i = 1; i < 4; i++) {
            arr[initNum] = i;
            initNum++;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        while (counter != 3) {
            System.out.print("Input number: ");
            Scanner sc = new Scanner(System.in);
            userData = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == userData) {
                    counter++;
                    System.out.println("You hit!");
                    break;
                }
                if (i == arr.length-1) {
                    System.out.println("You do not hit!");
                }
            }

            numOfGuesses++;
        }

        System.out.println("You win after " + numOfGuesses);

    }
}
