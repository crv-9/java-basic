package io.everyonecodes.java.t5b_files.examples.exercise1.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class NameReader {
    private String filePath = "src/io/everyonecodes/java/t5b_files/examples/exercise1/names.txt";

    public Optional<String> reader(){
        // declaring the path
        Path path = Path.of(filePath);

        //
        try {
            List<String> lines = Files.readAllLines(path);
            return getSingleString(lines);
        } catch (IOException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private static Optional<String> getSingleString(List<String> lines){

        if (lines.isEmpty()){
            return Optional.empty();
        } else {
            return Optional.of(lines.get(0));
        }

    }
}
