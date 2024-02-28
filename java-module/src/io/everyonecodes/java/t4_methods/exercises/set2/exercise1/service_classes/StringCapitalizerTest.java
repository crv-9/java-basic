package io.everyonecodes.java.t4_methods.exercises.set2.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCapitalizerTest {

    @ParameterizedTest
    @CsvSource({
            "carlos, Carlos",
            "kevin, Kevin",
            "sarah, Sarah",
            "ali, Ali"
    })
    void capitalize(String input, String expected){
        StringCapitalizer stringCapitalizer = new StringCapitalizer();

        String result = stringCapitalizer.capitalize(input);

        assertEquals(expected, result);
    }
}
