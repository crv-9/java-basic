package io.everyonecodes.java.practice_coding_contest.honey_comb.level2;

import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.LineReader;
import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.OutputWriterHoney;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class OutputWriterHoneyLevel2Test {

    // classes used in logic
    FreeCellsCounter freeCellsCounter = new FreeCellsCounter();

    // reader & writer
    LineReader reader = new LineReader();
    OutputWriterHoney writer = new OutputWriterHoney();


    // reading file
    String filePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/level2/files/level2_2.in";
    Path filePath = Path.of(filePathString);

    // writing file
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/level2/files/level2_2_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);

    @Test
    void writeOutput() throws IOException {
        List<String> fileLines = reader.readLines(filePath);
        List<String> outputStringList = freeCellsCounter.countFreeCells(fileLines);

        writer.writeOutputFile(outputStringList, outputFilePath);
    }

}
