package ua.sjerra.book.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nata on 26.12.2014.
 */
public class JukeBox3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
new JukeBox3().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("D:\\SjerraAndBates\\my-app\\src\\main\\java\\ua\\sjerra\\book\\SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSongs(line);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSongs(String lineToParce) {
        String[] tokens = lineToParce.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}

