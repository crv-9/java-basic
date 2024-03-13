package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.util.List;

public class DeathsInBookCounter {
    public static Integer count(List<Character> characterList, int bookNumber){
        int deathsInBook = 0;
        for (Character character: characterList) {
            if (character.getBookOfDeath() == bookNumber){
                deathsInBook++;
            }
        }
        return deathsInBook;
    }
}
