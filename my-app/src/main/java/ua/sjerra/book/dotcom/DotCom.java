package ua.sjerra.book.dotcom;

import java.util.ArrayList;

/**
 * Created by mmusienko on 3/10/15.
 */
public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Fail";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Sank!";
            } else {
                result = "Hit!";
            }

        }
        return result;
    }
}
