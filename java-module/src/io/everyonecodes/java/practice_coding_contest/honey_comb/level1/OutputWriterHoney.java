package io.everyonecodes.java.practice_coding_contest.honey_comb.level1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OutputWriterHoney {

    public static void writeOutputFile(List<String> stringList, Path outputFilePath) throws IOException {
        try{
            Files.write(outputFilePath, stringList);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("printed nothing");
        }
    }
}
