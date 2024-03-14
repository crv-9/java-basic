package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalDeathCounterTest {
    String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/got-characters.csv";
    TotalDeathCounter totalDeathCounter = new TotalDeathCounter();
    GotDataReader gotDataReader = new GotDataReader();

    @Test
    void counter(){
        List<Character> characterList = new ArrayList<>(List.of(
                new Character("Addam Marbrand",5, "male"),
                new Character("Aegon Frey (Jinglebell)", "male"),
                new Character("Adrack Humble", 6,  "male")));

        int result = totalDeathCounter.counter(characterList);

        assertEquals(2, result);
    }

    @Test
    void counterNone(){
        List<Character> characterList = new ArrayList<>(List.of(
                new Character("Addam Marbrand", "male"),
                new Character("Aegon Frey (Jinglebell)", "male"),
                new Character("Adrack Humble",   "male")));

        int result = totalDeathCounter.counter(characterList);

        assertEquals(0, result);
    }

    @Test
    void countAll() throws IOException {
        List<Character> characterList = gotDataReader.readData();

        int result = totalDeathCounter.counter(characterList);

        assertEquals(307, result);
    }




}
