package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestNameFinderTest {

    LongestNameFinder longestNameFinder = new LongestNameFinder();

    @Test
    void findLongestName(){
        List<Character> characterList = new ArrayList<>(List.of(
                new Character("Addam Marbrand", "male"),
                new Character("Aegon Frey (Jinglebell)", "male"),
                new Character("Adrack Humble", "male")));

        Character result = longestNameFinder.findLongestName(characterList);


        assertEquals("Aegon Frey (Jinglebell)", result.getName());

    }

}
