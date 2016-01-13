package sjerra.book.dotcom;

/**
 * Created by mmusienko on 2/23/15.
 */
public class SimpleDotComeTestDrive {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {1, 2, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
        String testResult = "Fail";
        if (result.equals("Hit!")) {
            testResult = "Pass";
        }
        System.out.println(testResult);
    }
}
