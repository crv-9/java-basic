package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level1.service_classes;

import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.LineReader;
import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.OutputWriterHoney;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputWriterHoneyRPSLevel1_ExampleTest {
    RPSAdmin rpsAdmin = new RPSAdmin();

    LineReader reader = new LineReader();
    OutputWriterHoney writer = new OutputWriterHoney();


    // reading file
    String filePathString = "";
    Path filePath = Path.of(filePathString);

    // writing file
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level1/files/level1_example_myfile.out";
    Path outputFilePath = Path.of(outputFilePathString);

    // example files
    String exampleInputFileString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level1/files/level1_example.in";
    Path exampleInputPath = Path.of(exampleInputFileString);
    String exampleOutputFileString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level1/files/level1_example.out";
    Path exampleOutputPath = Path.of(exampleOutputFileString);



    // testing the example given with my output for it.
    // it needs to be the same as the example answer output file
//    @Test
//    void testSameContentExample() throws IOException {
//
//        List<String> fileLines = reader.readLines(exampleInputPath);
//        List<String> outputStringList = rpsAdmin.getStyles(fileLines);
//
//        writer.writeOutputFile(outputStringList,outputFilePath);
//
//        assertEquals(-1, Files.mismatch(exampleOutputPath, outputFilePath));
//    }

    @Test
    void writerCreatesExpectedFile() throws IOException {
        List<String> fileLines = reader.readLines(exampleInputPath);
        List<String> outputStringList = rpsAdmin.getLineStyles(fileLines);

        writer.writeOutputFile(outputStringList, outputFilePath);

        List<String> result = Files.readAllLines(outputFilePath);

        List<String> expected = Files.readAllLines(exampleOutputPath);


        Assertions.assertLinesMatch(expected, result);
    }


}
