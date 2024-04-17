package io.everyonecodes.java.practice_coding_contest.honey_comb.level2;

import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.LineReader;
import io.everyonecodes.java.practice_coding_contest.honey_comb.level1.OutputWriter;

import java.nio.file.Path;

public class FreeCellsCounterTest {

    FreeCellsCounter freeCounter = new FreeCellsCounter();

    LineReader reader = new LineReader();
    OutputWriter writer = new OutputWriter();


    // reading file
    String filePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/files/level1/level1_5.in";
    Path filePath = Path.of(filePathString);

    // writing file
    String outputFilePathString = "src/io/everyonecodes/java/practice_coding_contest/honey_comb/files/level1/level1_5_answer.txt";
    Path outputFilePath = Path.of(outputFilePathString);


}
