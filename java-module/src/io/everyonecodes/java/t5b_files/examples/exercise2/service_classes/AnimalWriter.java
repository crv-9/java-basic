package io.everyonecodes.java.t5b_files.examples.exercise2.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;



public class AnimalWriter {
    String filePathString = "src/io/everyonecodes/java/t5b_files/examples/exercise2/service_classes/newanimals.txt";
    public void write(List<String> animalsList) throws IOException {

        Path filePath = Path.of(filePathString);
        Files.write(filePath, animalsList, StandardOpenOption.APPEND, StandardOpenOption.CREATE);


    }
}
