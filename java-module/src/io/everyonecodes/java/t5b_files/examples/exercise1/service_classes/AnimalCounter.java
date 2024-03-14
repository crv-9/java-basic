package io.everyonecodes.java.t5b_files.examples.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise4.service_classes.DoubleListMaximumFinder;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class AnimalCounter {
    private String filePath = "src/io/everyonecodes/java/t5b_files/examples/exercise1/animals.txt";
    public int count() throws IOException {
        Path path = Path.of(filePath);

        List<String> animals = Files.readAllLines(path);
        return animals.size();
    }
}
