package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exercises.sets.exercise2.test_classes;

import io.everyonecodes.java.t7b_datastructures.lecture_exercises.exercises.sets.exercise2.service_classes.BasicDictionary;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDictionaryTest {
    BasicDictionary finder = new BasicDictionary();

    @Test
    void findKnownWords(){
        String inputSentence = "The elegant cat jumped up the table";

        List<String> expected = List.of("the", "elegant", "jumped", "up");

        List<String> result = finder.findUnknownWords(inputSentence);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }
}
