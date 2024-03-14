package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestNameFinder {
    public static Character findLongestName(List<Character> characterList){
        for (Character character: characterList) {
            character.setNameLength(character.getName().length());
        }
        // Collections.sort based on Object's property. https://stackoverflow.com/questions/5805602/how-to-sort-list-of-objects-by-some-property
        // the first sorts them in ascending order, so I need to reverse to get the longest first.
        Collections.sort(characterList, Comparator.comparing(Character::getNameLength));
        Collections.reverse(characterList);
        return characterList.getFirst();
    }
}
