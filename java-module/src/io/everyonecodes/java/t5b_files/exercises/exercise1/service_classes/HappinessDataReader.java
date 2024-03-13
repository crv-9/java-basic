package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    public List<HappinessRecord> read() throws IOException{
        String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/world-happiness-2017.csv";
        Path filePath = Path.of(filePathString);

        List<String> fileLines = getAllFileLines(filePath);
        return getAllRecords(fileLines);
    }

    private List<String> getAllFileLines(Path filePath) throws IOException {
        return Files.readAllLines(filePath);
    }

    private List<HappinessRecord> getAllRecords(List<String> fileLines){
        List<HappinessRecord> happinessRecordList = new ArrayList<>(List.of());

            for (String line : fileLines) {
                HappinessDataParser happinessDataParser = new HappinessDataParser();
                if (happinessDataParser.parseLine(line).isPresent()){
                    happinessRecordList.add(happinessDataParser.parseLine(line).get());
                }
            }
        return happinessRecordList;
    }

}
