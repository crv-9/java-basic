package io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.data_classes.NewSong;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SongFinder {
    public static Optional<NewSong> findSong(List<NewSong> songList, int minDuration, int maxDuration, double minRating){
        for (NewSong song: songList) {
            if (song.getSeconds() >= minDuration && song.getSeconds()<= maxDuration && song.getRating() >= minRating){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
}
