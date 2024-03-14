package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArtistFinderTest {
    ArtistFinder artistFinder = new ArtistFinder();
    @Test
    void findForNormal() throws IOException {
        Optional<String> result = artistFinder.findFor("Dance Monkey");

        assertTrue(result.isPresent());
        assertEquals("Tones and I", result.get());
    }

    @Test
    void findForNoResult() throws IOException{
        Optional<String> result = artistFinder.findFor("Here Comes the Sun");

        assertTrue(result.isEmpty());
    }
}
