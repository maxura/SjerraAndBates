package ua.sjerra.book.collections;

/**
 * Created by nata on 26.12.2014.
 */
public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t) {
        title = t;
    }

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }


    @Override
    public boolean equals(Object asSong) {
        Song s = (Song) asSong;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return title;
    }


    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }
}
