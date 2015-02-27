package ua.sjerra.book.dotcom;

/**
 * Created by mmusienko on 2/23/15.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Fail";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit!";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Sank!";
        }
        System.out.println(result);
        return result;
    }
}
