package ua.ua.sjerra.book.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 */
public class JukeBox1 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox1().go();
    }

    public void go() {
        getSong();
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSong() {
        try {
            File file = new File("D:\\SjerraAndBates\\my-app\\src\\main\\java\\ua\\sjerra\\book\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
