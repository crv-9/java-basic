package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes.Song;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpotifyDataReaderTest {
    SpotifyDataReader reader = new SpotifyDataReader();

    @Test
    void readFirstSongTitle() throws IOException {
        String firstSongTitle = reader.read().getFirst().getTitle();

        assertEquals("Señorita", firstSongTitle);
    }

    @Test
    void readListSize() throws IOException{
        int result = reader.read().size();

        assertEquals(50,result);
    }

    @Test
    void readFirstSong() throws IOException{
        Song firstSong = reader.read().getFirst();

        assertEquals(new Song("Señorita", 1, "Shawn Mendes"), firstSong);
    }

}
