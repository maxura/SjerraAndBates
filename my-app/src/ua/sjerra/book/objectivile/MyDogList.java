package sjerra.book.objectivile;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by mmusienko on 4/3/15.
 */
public class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex]=d;
            System.out.println("Dog has been added in the cell " + nextIndex);
        }

    }

}
