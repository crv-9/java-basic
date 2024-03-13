package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadCharactersExtractorTest {

    String firstFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/deaths_expected.txt";
    String secondFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/my_deaths_extract.txt";

    DeadCharactersExtractor deadCharactersExtractor = new DeadCharactersExtractor();
    GotDataReader gotDataReader = new GotDataReader();

    @Test
    void extract() throws IOException {
        Path firstPath  = Path.of(firstFilePath);
        int expectedListSize = Files.readAllLines(firstPath).size();



        Path secondPath  = Path.of(secondFilePath);

        deadCharactersExtractor.extract(gotDataReader.readData());

        int myListSize = Files.readAllLines(secondPath).size();

        assertEquals(expectedListSize, myListSize);

    }

    @BeforeEach
    @AfterEach
    void deleteNewFile() throws IOException{
        Path path = Path.of(secondFilePath);
        Files.deleteIfExists(path);
    }

}
