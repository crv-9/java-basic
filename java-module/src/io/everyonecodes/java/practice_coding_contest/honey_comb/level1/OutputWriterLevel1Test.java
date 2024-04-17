package io.everyonecodes.java.practice_coding_contest.honey_comb.level1;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputWriterLevel1Test {
    CellCounter counter = new CellCounter();
    LineReader reader = new LineReader();
    OutputWriter writer = new OutputWriter();


// reading file
    String filePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/level1/files/level1_5.in";
    Path filePath = Path.of(filePathString);

// writing file
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/level1/files/level1_5_answers.in";
    Path outputFilePath = Path.of(outputFilePathString);


//    @Test
//    void countOs() throws IOException {
//        List<String> fileLines = reader.readLines(filePath);
//        int result = counter.countOs(fileLines);
//
//        assertEquals(80, result);
//
//    }

    @Test
    void writeOutput() throws IOException{
        List<String> fileLines = reader.readLines(filePath);
        List<String> outputStringList = counter.countCells(fileLines);

        writer.writeOutputFile(outputStringList, outputFilePath);
    }

//    @BeforeEach
//    @AfterEach
//    void deleteNewFile() throws IOException{
//        Path path = Path.of(outputFilePathString);
//        Files.deleteIfExists(path);
//    }

}
