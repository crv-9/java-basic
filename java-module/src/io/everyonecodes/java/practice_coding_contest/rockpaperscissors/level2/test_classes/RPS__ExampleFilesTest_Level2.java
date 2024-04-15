package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level2.test_classes;

import io.everyonecodes.java.coding_contest.a_general_classes.FileReader;
import io.everyonecodes.java.coding_contest.a_general_classes.OutputWriter;
import io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level2.service_classes.RPSAdminLevel2;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class RPS__ExampleFilesTest_Level2 {

    // This Test class will compare our result with the example result

    // import logic classes

    RPSAdminLevel2 adminLevel2 = new RPSAdminLevel2();


    // reader & writer classes -> make sure they are imported
    FileReader reader = new FileReader();
    OutputWriter writer = new OutputWriter();

    // writing output file
        /*Edit string to be the file's path from content root*/
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level2/files/level2_example_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);

    // example files
        /*Edit string to be the file's path from content root*/
    String exampleInputFileString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level2/files/level2_example.in";
    Path exampleInputPath = Path.of(exampleInputFileString);
    String exampleOutputFileString = "src/io/everyonecodes/java/practice_coding_contest/rockpaperscissors/level2/files/level2_example.out";
    Path exampleOutputPath = Path.of(exampleOutputFileString);

    @Test
    void WriterCompareExampleExpectedFile() throws IOException {
        List<String> fileLines = reader.readLines(exampleInputPath);

        // Edit below to add the logic class and method
        List<String> outputStringList = adminLevel2.getTwoRounds(fileLines);


        writer.writeOutputFile(outputStringList, outputFilePath);

        List<String> result = Files.readAllLines(outputFilePath);
        List<String> expected = Files.readAllLines(exampleOutputPath);

        assertLinesMatch(expected, result);

    }

    // Optional

//    @BeforeEach
//    @AfterEach
//    void delete() throws IOException {
//        Files.deleteIfExists(outputFilePath);
//    }

}
