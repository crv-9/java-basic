package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public static Optional<Character> parseLine(String line){
        List<String> characterInfo = List.of(line.split(";", 8));
        // in the file, gender is provided as 0 for female and 1 for male.
        String name = characterInfo.get(0);
        String bookOfDeath = characterInfo.get(3);
        String gender = (Integer.parseInt(characterInfo.get(6)) == 0 ) ? "female": "male";


        if (bookOfDeath.isEmpty()){
            try {
                return Optional.of(new Character(name,gender));
            } catch (Exception e){
                System.out.println("there was an error creating this Character - without BookOfDeath");
                return Optional.empty();
            }
        } else {
            try {
                return Optional.of(new Character(name, Integer.parseInt(bookOfDeath), gender));
            } catch (NumberFormatException nfe){
                System.out.println("there was an error creating this Character - with BookOfDeath");
                return Optional.empty();
            }
        }
    }
}
