package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GotDataReaderTest {
    String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/got-characters.csv";
    GotDataReader gotDataReader = new GotDataReader();
    @Test
    void reader() throws IOException{
        String firstCharacter = gotDataReader.readData().getFirst().getName();

        assertEquals("Addam Marbrand", firstCharacter);
    }
}
