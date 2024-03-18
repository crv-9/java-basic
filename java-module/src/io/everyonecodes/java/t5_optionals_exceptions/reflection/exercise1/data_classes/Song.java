package io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.data_classes;

public class Song {
    String title;
    int songDuration;
    double rating;

    public Song(String title, int songDuration, double rating) {
        this.title = title;
        this.songDuration = songDuration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
