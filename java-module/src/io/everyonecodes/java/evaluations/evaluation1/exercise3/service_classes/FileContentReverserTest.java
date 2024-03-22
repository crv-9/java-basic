package io.everyonecodes.java.evaluations.evaluation1.exercise3.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileContentReverserTest {
    FileContentReverser reverser = new FileContentReverser();
    String inputStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/lines.txt";
    String expectedStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/lines-reversed_expected.txt";
    String myStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/lines-reversed.txt";

    @Test
    void reverse() throws IOException{
        Path inputPath = Path.of(inputStringFilePath);
        Path outputPath = Path.of(myStringFilePath);
        Path expectedPath = Path.of(expectedStringFilePath);

        reverser.reverse(inputPath, outputPath);

        //expected values
        String firstExpectedValue = reverser.getAllFileLines(expectedPath).getFirst();
        String lastExpectedValue = reverser.getAllFileLines(expectedPath).getLast();

        // result values
        String firstResultValue = reverser.getAllFileLines(outputPath).getFirst();
        String lastResultValue = reverser.getAllFileLines(outputPath).getLast();

        assertEquals(firstExpectedValue, firstResultValue);
        assertEquals(lastExpectedValue, lastResultValue);
    }

    @BeforeEach
    @AfterEach
    void deleteNewFile() throws IOException {
        Path path = Path.of(myStringFilePath);
        Files.deleteIfExists(path);
    }
}