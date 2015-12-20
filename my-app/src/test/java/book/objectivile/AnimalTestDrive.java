package ua.sjerra.book.objectivile;

import javax.smartcardio.CardChannel;

/**
 * Created by mmusienko on 4/6/15.
 */
public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
    }
}
