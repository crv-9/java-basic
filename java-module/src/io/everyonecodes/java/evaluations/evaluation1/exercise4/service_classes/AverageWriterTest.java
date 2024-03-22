package io.everyonecodes.java.evaluations.evaluation1.exercise4.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageWriterTest {
    AverageWriter writer = new AverageWriter();
    String inputStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/numbers.txt";
    String expectedStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/averages_expected.txt";
    String myStringFilePath = "src/io/everyonecodes/java/evaluations/evaluation1/files/averages_myoutput.txt";

    @Test
    void write() throws IOException{
        Path inputPath = Path.of(inputStringFilePath);
        Path outputPath = Path.of(myStringFilePath);
        Path expectedPath = Path.of(expectedStringFilePath);

        writer.write(inputPath, outputPath);

        //expected values
        String firstExpectedValue = writer.getAllFileLines(expectedPath).getFirst();
        String lastExpectedValue = writer.getAllFileLines(expectedPath).getLast();

        //result values
        String firstResultValue = writer.getAllFileLines(outputPath).getFirst();
        String lastResultValue = writer.getAllFileLines(outputPath).getLast();

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
