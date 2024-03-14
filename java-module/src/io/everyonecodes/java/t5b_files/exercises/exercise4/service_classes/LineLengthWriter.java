package io.everyonecodes.java.t5b_files.exercises.exercise4.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineLengthWriter {
    public void write(List<String> stringList) throws IOException {
        String stringFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/my_stringlengths_expected.txt";
        Path path = Path.of(stringFilePath);

        try {
            Files.write(path, stringList);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Printed nothing");
        }

    }
}
