package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumWriterTest {

    String inputString = "src/io/everyonecodes/java/t5b_files/reflection/exercise1/files/input.csv";
    String outputString = "src/io/everyonecodes/java/t5b_files/reflection/exercise1/files/output.csv";

    IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();
    StringToIntegersParser parser = new StringToIntegersParser();
    LinesCalculator linesCalculator = new LinesCalculator();
    SumWriter sumWriter = new SumWriter();

    Path inputPath = Path.of(inputString);
    Path outputPath = Path.of(outputString);
    @Test
    void checkFirst()throws IOException {
        sumWriter.write(inputPath, outputPath);

        String actual = sumWriter.getAllFileLines(outputPath).getFirst();
        String expected = "-10";


        assertEquals(expected,actual);
    }

    // i didn't have enough time to test the writer further

    @BeforeEach
    @AfterEach
    void deleteNewFile() throws IOException{
        Path path = Path.of(outputString);
        Files.deleteIfExists(path);
    }
}
