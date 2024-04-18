package io.everyonecodes.java.coding_contest.b_template_classes;

import io.everyonecodes.java.coding_contest.a_general_classes.FileReader;
import io.everyonecodes.java.coding_contest.a_general_classes.OutputWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class Tmp__ExampleFilesTest_Level {

    // This Test class will compare our result with the example result

    // import logic classes

        /*TO DO*/


    // reader & writer classes -> make sure they are imported
    FileReader reader = new FileReader();
    OutputWriter writer = new OutputWriter();

    // writing output file
        /*Edit string to be the file's path from content root*/
    String outputFilePathString = "";
    Path outputFilePath = Path.of(outputFilePathString);

    // example files
        /*Edit string to be the file's path from content root*/
    String exampleInputFileString = "";
    Path exampleInputPath = Path.of(exampleInputFileString);
    String exampleOutputFileString = "";
    Path exampleOutputPath = Path.of(exampleOutputFileString);

    @Test
    void WriterCompareExampleExpectedFile() throws IOException {
        List<String> fileLines = reader.readLines(exampleInputPath);

        // Edit below to add the logic class and method
        //List<String> outputStringList =


        //writer.writeOutputFile(outputStringList, outputFilePath);

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
