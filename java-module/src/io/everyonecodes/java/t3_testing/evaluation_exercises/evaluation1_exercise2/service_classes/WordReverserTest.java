package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverserTest {
    @ParameterizedTest
    @CsvSource({
            "example, elpmaxe",
            "level, level",
            "Radar, radaR",
            "This is a full sentence., .ecnetnes lluf a si sihT"
    })
    void getReversedWord(String input, String expected){

        WordReverser wordReverser = new WordReverser();

        String result = wordReverser.getReversedWord(input);

        assertEquals(expected, result);

    }
}
