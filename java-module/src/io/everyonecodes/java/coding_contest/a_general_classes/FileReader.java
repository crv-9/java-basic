package io.everyonecodes.java.coding_contest.a_general_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    // This class reads the file's lines
    // We need to always call it from both our Example test class and the writer test class
    public static List<String> readLines(Path filePath) throws IOException {

        return getAllFileLines(filePath);
    }

    public static List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }
}
