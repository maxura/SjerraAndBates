package ua.sjerra.book.dotcom;

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
        for (DotCom dotComToSet  : dotComsList) {
            
        }
    }
}
