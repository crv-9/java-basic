package io.everyonecodes.java.t5b_files.examples.exercise2.service_classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AnimalWriterTest {
    AnimalWriter animalWriter = new AnimalWriter();
    String filePathString = "src/io/everyonecodes/java/t5b_files/examples/exercise2/service_classes/newanimals.txt";

    @Test
    void writeWritesToAnimalFile() throws IOException {
        List<String> animals = List.of("Elephant", "Snail", "Ant");

        animalWriter.write(animals);

        Path path = Path.of(filePathString);
        List<String> result = Files.readAllLines(path);

        List<String> expected = List.of("Elephant", "Snail", "Ant");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void writeAppendsToAnimalFile() throws IOException {
        List<String> firstAnimals = List.of("Elephant", "Snail", "Ant");
        List<String> secondAnimals = List.of("Tiger");

        animalWriter.write(firstAnimals);
        animalWriter.write(secondAnimals);
        Path path = Path.of(filePathString);
        List<String> result = Files.readAllLines(path);


        List<String> expected = List.of("Elephant", "Snail", "Ant", "Tiger");
        Assertions.assertEquals(expected, result);
    }

    @BeforeEach
    @AfterEach
    void deleteNewAnimalsFile() throws IOException {
        Path path = Path.of(filePathString);
        Files.deleteIfExists(path);

    }



}
