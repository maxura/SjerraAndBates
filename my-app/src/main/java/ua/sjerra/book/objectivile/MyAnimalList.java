package ua.sjerra.book.objectivile;

/**
 * Created by mmusienko on 4/6/15.
 */
public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("The animal has been added into cell " + nextIndex);
            nextIndex++;
        }
    }
}
