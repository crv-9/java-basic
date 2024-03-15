package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumWriter {

    public void write(Path input, Path output)throws IOException{
        LinesCalculator linesCalculator = new LinesCalculator();

        Path inputFilePath = input;
        Path outputFilePath = output;

        List<String> inputStringList = getAllFileLines(inputFilePath);

        List<String> outputStringList = linesCalculator.calculateLineSum(inputStringList);

        try{
            Files.write(outputFilePath, outputStringList);
        }catch (IOException ioe){
            System.out.println("Problem writing into file");
        }


    }

    public List<String> getAllFileLines(Path inputFilePath) throws IOException {
        return Files.readAllLines(inputFilePath);
    }

}
