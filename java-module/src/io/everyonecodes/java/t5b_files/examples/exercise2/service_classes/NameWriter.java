package io.everyonecodes.java.t5b_files.examples.exercise2.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NameWriter {
    public void write(String name) throws IOException {
        String stringFilePath = "src/io/everyonecodes/java/t5b_files/examples/exercise2/service_classes/newname.txt";
        Path filePath = Path.of(stringFilePath);

        List<String> namesList = List.of(name);
        Files.write(filePath, namesList);
    }
}
