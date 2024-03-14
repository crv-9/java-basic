package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {
    public static void extract(List<Character> characterList){
        String stringFilePath = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/my_deaths_extract.txt";
        Path path = Path.of(stringFilePath);
        List<String> linesToAdd = new ArrayList<>(List.of());

        for (Character character: characterList) {
            if (character.getBookOfDeath() > 0){
                linesToAdd.add(character.getName());
            }
        }

        try {
            Files.write(path, linesToAdd);
        } catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("Printed/extracted nothing");
        }
    }
}
