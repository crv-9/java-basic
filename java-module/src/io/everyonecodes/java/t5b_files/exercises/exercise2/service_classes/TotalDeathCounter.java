package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;
import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;
import java.util.List;
public class TotalDeathCounter {
    public Integer counter(List<Character> characterList){
        int countCharactersDead = 0;
        for (Character character: characterList) {
            if (character.getBookOfDeath() > 0){
                countCharactersDead++;
            }
        }
        return countCharactersDead;
    }
}