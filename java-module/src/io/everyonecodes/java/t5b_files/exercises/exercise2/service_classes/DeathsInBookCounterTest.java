package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeathsInBookCounterTest {
    DeathsInBookCounter deathsInBookCounter = new DeathsInBookCounter();

    @Test
    void count(){
        List<Character> characterList = new ArrayList<>(List.of(
                new Character("Addam Marbrand", "male"),
                new Character("Aegon Frey (Jinglebell)", 1, "male"),
                new Character("TestOne", 1, "male"),
                new Character("Test3", 2, "male"),
                new Character("Adrack Humble",1, "male")));

        int result = deathsInBookCounter.count(characterList, 1);

        assertEquals(3, result);

    }
}
