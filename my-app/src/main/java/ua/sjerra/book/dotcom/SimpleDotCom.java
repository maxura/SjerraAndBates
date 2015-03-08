package ua.sjerra.book.dotcom;

/**
 * Created by mmusienko on 2/23/15.
 */
public class SimpleDotCom {

    int[] locationCells;

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("Enter your number");
        }
    }


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
