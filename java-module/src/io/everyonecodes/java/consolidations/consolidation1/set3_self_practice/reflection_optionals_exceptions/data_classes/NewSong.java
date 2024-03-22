package io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.data_classes;

import java.util.Objects;

public class NewSong {
    String title;
    int seconds;
    double rating;

    public NewSong(String title, int seconds, double rating) {
        this.title = title;
        this.seconds = seconds;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewSong newSong = (NewSong) o;
        return seconds == newSong.seconds && Double.compare(rating, newSong.rating) == 0 && Objects.equals(title, newSong.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, seconds, rating);
    }
}
