package ua.ua.sjerra.book.dotcom;

import java.util.ArrayList;

/**
 * Created by mmusienko on 3/10/15.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your point is sink three sites");
        System.out.println("Pets.com,eToys.com, Go2.com");
        System.out.println("Try to sink they with minimal amount of the attempts");
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Do your step:");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Fail";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Hit!")) {
                break;
            }
            if (result.equals("Sank!")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All sites go to bottom. Your stocks are worth nothing" );
        if (numOfGuesses <=18){
            System.out.println("It took you 18 attempts ");
            System.out.println("You managed to get out before your investment drowned ");
        }
        else {
            System.out.println("This was very long " + numOfGuesses + "attemps");
            System.out.println("Fishes dance around yours investments");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }
}
