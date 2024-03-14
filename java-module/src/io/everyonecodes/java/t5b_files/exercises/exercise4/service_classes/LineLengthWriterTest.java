package io.everyonecodes.java.t5b_files.exercises.exercise4.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthWriterTest {

    LineLengthWriter lineLengthWriter = new LineLengthWriter();

    String expectedStringFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/stringlengths_expected.txt";
    String myStringFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/my_stringlengths_expected.txt";

    LineLengthReader reader = new LineLengthReader();
    IntegerListToStringListConverter converter = new IntegerListToStringListConverter();
    LineLengthWriter writer = new LineLengthWriter();

    @Test
    void writeCheckFirst() throws IOException {
        Path firstFilePath = Path.of(myStringFilePath);
        Path secondFilePath = Path.of(expectedStringFilePath);

        writer.write(converter.convert(reader.read()));

        String expectedValue = reader.getAllFileLines(firstFilePath).getFirst();
        String resultValue = reader.getAllFileLines(secondFilePath).getFirst();
        assertEquals(expectedValue, resultValue);
    }

    @Test
    void writeCheckLast() throws IOException {
        Path firstFilePath = Path.of(myStringFilePath);
        Path secondFilePath = Path.of(expectedStringFilePath);

        writer.write(converter.convert(reader.read()));

        String expectedValue = reader.getAllFileLines(firstFilePath).getLast();
        String resultValue = reader.getAllFileLines(secondFilePath).getLast();
        assertEquals(expectedValue, resultValue);
    }

    @BeforeEach
    @AfterEach
    void deleteNewFile() throws IOException{
        Path path = Path.of(myStringFilePath);
        Files.deleteIfExists(path);
    }
}
