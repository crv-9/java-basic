package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main = new Main();

    @ParameterizedTest
    @CsvSource({
            "'1 2 3.5', 6.5",
            "'1 3 10.5 23.6 4', 42.1"
    })
    void calculate(String input, double expected){
        double result = main.calculate(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "'1 3 10.5 23.6 hello 10', 48.1",
            "'1 2 what 3.5', 6.5"
    })
    void calculateMiddleWord(String input, double expected){
        double result = main.calculate(input);

        assertEquals(expected, result);
    }

}
