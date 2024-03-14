package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes.GotDataParser.parseLine;

public class GotDataReader {
    public List<Character> readData() throws IOException {
        String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/got-characters.csv";
        Path filePath = Path.of(filePathString);

        List<String> fileLines = getAllFileLines(filePath);

        //here i'm ignoring the first line as it is the header
        List<Character> characterList = getAllCharacters(fileLines.subList(1, fileLines.size()));

        return characterList;
    }

    private List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    private List<Character> getAllCharacters(List<String> fileLines) {
        List<Character> gotCharactersList = new ArrayList<>(List.of());

        for (String line : fileLines) {
            GotDataParser parser = new GotDataParser();

            if (parser.parseLine(line).isPresent()) {
                gotCharactersList.add(parser.parseLine(line).get());
            }
        }
        return gotCharactersList;
    }
}
