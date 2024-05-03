package io.everyonecodes.java.consolidations.consolidation2.exercise3.service_classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
* The class CardSequenceReader with the read method.
* It reads from the sequences.txt file and returns a list of card sequences that corresponds to that file.
* Each line in the file represents one sequence of cards.
* If the reading of the file fails for some reason, you can just return an empty list instead.
* */

public class CardSequenceReader {

    String filePathString = "src/io/everyonecodes/java/consolidations/consolidation2/exercise3/files/sequences.txt";
    Path filePath = Path.of(filePathString);
    CardSequenceParser cardSequenceParser = new CardSequenceParser();

    public List<CardSequence> readLines() {

             List<CardSequence> cardSequenceList = new ArrayList<>();

             try {
                 List<String> fileLines = getAllFileLines(filePath);
                 for (int i = 1; i < fileLines.size(); i++) {
                     cardSequenceList.add(cardSequenceParser.parse(fileLines.get(i)));
                 }


             } catch (IOException ioe){
                 return cardSequenceList;
             }

             return cardSequenceList;
    }

    public static List<String> getAllFileLines(Path filePath) throws IOException{
             return Files.readAllLines(filePath);
    }

}
