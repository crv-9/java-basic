package io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.data_classes.Song;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SongPicker {
    public static Optional<Song> pickSong(List<Song> songsList, int minDuration, int maxDuration, double minRating){


        if (songsList.isEmpty()){
            return Optional.empty();
        }

        for (Song song: songsList) {
            if (song.getSongDuration() >= minDuration && song.getSongDuration() <= maxDuration && song.getRating() > minRating){
                return Optional.of(song);
            }
        }

        return Optional.empty();
    }
}
