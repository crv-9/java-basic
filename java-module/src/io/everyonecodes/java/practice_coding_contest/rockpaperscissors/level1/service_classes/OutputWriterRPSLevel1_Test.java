package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level1.service_classes;

import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.LineReader;
import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.OutputWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OutputWriterRPSLevel1_Test {
    RPSAdmin rpsAdmin = new RPSAdmin();

    LineReader reader = new LineReader();
    OutputWriter writer = new OutputWriter();


    // reading file
    String filePathString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level1/files/level1_5.in";
    Path filePath = Path.of(filePathString);

    // writing file
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level1/files/level1_5_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);



    @Test
    void writeOutput() throws IOException{
        List<String> fileLines = reader.readLines(filePath);
        List<String> outputStringList = rpsAdmin.getStyles(fileLines);

        writer.writeOutputFile(outputStringList, outputFilePath);
    }




}
