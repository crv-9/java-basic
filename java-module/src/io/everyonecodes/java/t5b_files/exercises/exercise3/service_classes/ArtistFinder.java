package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes.Song;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

public class ArtistFinder {
    public Optional<String> findFor(String songTitle) throws IOException {
        SpotifyDataReader reader = new SpotifyDataReader();

        for (Song song : reader.read()) {
            if (song.getTitle().equals(songTitle)){
                return Optional.of(song.getArtist());
            }
        }
        return Optional.empty();
    }
}
