package io.everyonecodes.java.evaluations.evaluation1.exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstVowelFinderTest {
    FirstVowelFinder finder = new FirstVowelFinder();
    @ParameterizedTest
    @CsvSource({
            "carlos, a",
            "CARLOS, a",
            "CaARLoOS, a",
            "bedi, e",
            "diana, i",
            "roberto, o",
            "ruzica, u",
    })
    void find(String input, String expected){
        String result = finder.find(input);

        assertEquals(expected, result);
    }

    @Test
    void findEmpty(){
        String result = finder.find("");
        assertEquals("",result);
    }

}
