package io.everyonecodes.java.t5b_files.exercises.exercise4.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {


    public List<Integer> read() throws IOException{
        String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/strings.txt";
        Path filePath = Path.of(filePathString);

        List<String> stringList = getAllFileLines(filePath);

        return getIntegerList(stringList);
    }

    public List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    private List<Integer> getIntegerList(List<String> stringList){
        List<Integer> integerList = new ArrayList<>(List.of());

        for (String string: stringList) {
            integerList.add(string.length());
        }
        return integerList;
    }


}
