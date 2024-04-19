package io.everyonecodes.java.coding_contest.level1.test_classes;

import io.everyonecodes.java.coding_contest.a_general_classes.FileReader;
import io.everyonecodes.java.coding_contest.a_general_classes.OutputWriter;
import io.everyonecodes.java.coding_contest.level1.MoneyAdmin;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class Tmp__ExampleFilesTest_Level1 {

    // This Test class will compare our result with the example result

    // import logic classes

    MoneyAdmin moneyAdmin = new MoneyAdmin();


    // reader & writer classes -> make sure they are imported
    FileReader reader = new FileReader();
    OutputWriter writer = new OutputWriter();

    // writing output file
        /*Edit string to be the file's path from content root*/
    String outputFilePathString = "src/io/everyonecodes/java/coding_contest/level1/files/level1_example_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);

    // example files
        /*Edit string to be the file's path from content root*/
    String exampleInputFileString = "src/io/everyonecodes/java/coding_contest/level1/files/level1_example.in";
    Path exampleInputPath = Path.of(exampleInputFileString);
    String exampleOutputFileString = "src/io/everyonecodes/java/coding_contest/level1/files/level1_example.out";
    Path exampleOutputPath = Path.of(exampleOutputFileString);

    @Test
    void WriterCompareExampleExpectedFile() throws IOException {
        List<String> fileLines = reader.readLines(exampleInputPath);

        // Edit below to add the logic class and method
        List<String> outputStringList = moneyAdmin.getAmountOfCoins(fileLines);


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
