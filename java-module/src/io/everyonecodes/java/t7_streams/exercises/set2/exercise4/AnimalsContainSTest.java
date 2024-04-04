package io.everyonecodes.java.t7_streams.exercises.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsContainSTest {
    String initialFilePathString = "src/io/everyonecodes/java/t7_streams/exercises/set2/files/animals.txt";
    Path initialFilePath = Path.of(initialFilePathString);
    String destinationFilePathString = "src/io/everyonecodes/java/t7_streams/exercises/set2/files/animals-s.txt";
    Path destinationFilePath = Path.of(destinationFilePathString);
    String expectedFilePathString = "src/io/everyonecodes/java/t7_streams/exercises/set2/files/animals-s_expected.txt";
    Path expectedFilePath = Path.of(expectedFilePathString);

    @Test
    void test() throws IOException {

        List<String> fileLines = Files.readAllLines(initialFilePath);

        Stream<String> myStream = fileLines.stream();

        List<String> resultingLines = myStream
                .map(String::toLowerCase) // used method reference instead of lambda (animal -> animal.toLowerCase())
                .filter(animal -> animal.contains("s"))
                .map(String::toUpperCase) // used method reference instead of lambda (animal -> animal.toUpperCase())
                .toList()
        ;
        // .filter(animal -> animal.contains("s") || animal.contains"S")

        Files.writeString(destinationFilePath, String.join("\n",resultingLines));
        //Using the above code because the normal .write adds an extra line at the end, which makes the assertion be false
        // Files.write(destinationFilePath, resultingLines);

        // The method Files::mismatch, added in Java 12, compares the contents of two files.
        // It returns -1 if the files are identical, and otherwise, it returns the position in bytes of the first mismatch.

        assertEquals(-1, Files.mismatch(expectedFilePath, destinationFilePath));
        // assertLinesMatch(expectedLines,resultingLines)
        // this one above is to check if the lines are the same.
    }

    @BeforeEach
    @AfterEach
    void deleteNewFile() throws IOException{
        Path path = Path.of(destinationFilePathString);
        Files.deleteIfExists(path);
    }
}
