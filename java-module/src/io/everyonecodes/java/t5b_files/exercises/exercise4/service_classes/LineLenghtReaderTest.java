package io.everyonecodes.java.t5b_files.exercises.exercise4.service_classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLenghtReaderTest {

    LineLengthReader reader = new LineLengthReader();

    @Test
    void readCheckFirst() throws IOException {

        Integer result = reader.read().getFirst();

        assertEquals(86, result);
    }

    @Test
    void readCheckLast() throws IOException {

        Integer result = reader.read().getLast();

        assertEquals(66, result);
    }

    @Test
    void readCheckListSize() throws IOException{
        int result = reader.read().size();

        assertEquals(120, result);
    }

}
