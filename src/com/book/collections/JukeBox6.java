package com.book.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nata on 28.12.2014.
 */
public class JukeBox6 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox6().go();
    }


    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
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
        Song nextSong = new Song(tokens[0]);
        songList.add(nextSong);
    }
}
