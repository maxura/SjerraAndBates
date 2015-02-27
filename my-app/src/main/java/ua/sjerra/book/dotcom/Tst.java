package ua.sjerra.book.dotcom;

import java.util.Scanner;

/**
 * Created by mmusienko on 2/27/15.
 */
public class Tst {
    public static void main(String[] args) {
        int p = 1;
        int arr[] = new int[7];
        int numOfGuesses = 0;
        int counter = 1;
        int userData=0;
        int initNum = ((int) (Math.random() * 5));
        System.out.println(initNum);
        for (int i = 0; i < 3; i++) {
            arr[initNum] = p++;
            initNum++;
        }

        for (int i : arr) {
            System.out.print(arr[i]);
        }
//        while (counter != 3) {
//            System.out.print("Input number: ");
//            Scanner sc = new Scanner(System.in);
//            userData =sc.nextInt();
//            for (int i = 0; i < 7; i++) {
//
//                if (arr[i] == userData) {
//                    counter++;
//                    System.out.println("You hit:");
//                    break;
//                }
//              else {
//                    System.out.println("Not hit:");
//                    break;
//                }
//            }
//
//        }
//        System.out.println("Amout of guesses: " + numOfGuesses+1);
//        System.out.println("You win after " + counter);

    }
}
