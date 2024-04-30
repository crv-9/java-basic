package io.everyonecodes.java.coding_contest.level2.test_classes;

import io.everyonecodes.java.coding_contest.a_general_classes.FileReader;
import io.everyonecodes.java.coding_contest.a_general_classes.OutputWriter;
import io.everyonecodes.java.coding_contest.level2.MoneyAdminWithdrawal;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Tmp__WriteOutputViaTest_Level2 {
    // This class will be used to run the logic and write into the output file for each level

    // import logic classes

    MoneyAdminWithdrawal adminWithdrawal = new MoneyAdminWithdrawal();

    // reader & writer  -> make sure they are imported
    FileReader reader = new FileReader();
    OutputWriter writer = new OutputWriter();

    // level input file
        /*Edit string to be the file's path from content root*/
    String filePathString = "src/io/everyonecodes/java/coding_contest/level2/files/level2_5.in";
    Path filePath = Path.of(filePathString);

    // level output file
        /*Edit string to be the file's path from content root*/
    String outputFilePathString = "src/io/everyonecodes/java/coding_contest/level2/files/level2_5_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);

    @Test
    void writeOutput() throws IOException {
        List<String> fileLines = reader.readLines(filePath);

        // Edit below to add the logic class and method
        List<String> outputStringList = adminWithdrawal.getWithdrawal(fileLines);


        writer.writeOutputFile(outputStringList, outputFilePath);

    }

}