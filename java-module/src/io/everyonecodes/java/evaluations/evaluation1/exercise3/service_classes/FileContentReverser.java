package io.everyonecodes.java.evaluations.evaluation1.exercise3.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {
    public void reverse(Path inputPath, Path outputPath) throws IOException {

        List<String> fileLines = getAllFileLines(inputPath);

        writeIntoFile(reverseLines(fileLines), outputPath);
    }

    public List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    private List<String> reverseLines(List<String> fileLines){
        Collections.reverse(fileLines);
        return fileLines;
    }

    private void writeIntoFile(List<String> reversedLines, Path outputPath) throws IOException{
        Files.write(outputPath, reversedLines);
    }

}
