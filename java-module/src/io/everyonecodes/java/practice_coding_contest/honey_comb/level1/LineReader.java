package io.everyonecodes.java.practice_coding_contest.honey_comb.level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineReader {

    public static List<String> readLines(Path filePath) throws IOException {

        return getAllFileLines(filePath);
    }

    public static List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }
}
