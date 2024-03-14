package io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes;

import java.util.Objects;

public class Song {
    String title;
    int rank;
    String artist;

    public Song(String title, int rank, String artist) {
        this.title = title;
        this.rank = rank;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return rank == song.rank && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rank, artist);
    }
}
