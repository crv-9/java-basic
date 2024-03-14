package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes.Song;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpotifyDataParserTest {
    SpotifyDataParser spotifyDataParser = new SpotifyDataParser();

    @Test
    void parseLine(){
        String inputString = "1;\"Señorita\";\"Shawn Mendes\";\"canadian pop\";117;55;76;-6;8;75;191;4;3;79";

        Optional<Song> result = spotifyDataParser.parseLine(inputString);

        assertTrue(result.isPresent());
        assertEquals(new Song("Señorita", 1, "Shawn Mendes"), result.get());
    }
}
