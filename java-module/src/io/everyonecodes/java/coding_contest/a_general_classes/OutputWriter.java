package io.everyonecodes.java.coding_contest.a_general_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OutputWriter {

    // this class will write our logic output into the desired file

    public static void writeOutputFile(List<String> stringList, Path outputFilePath) throws IOException {
        try{
            Files.write(outputFilePath, stringList);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("printed nothing");
        }
    }

}
