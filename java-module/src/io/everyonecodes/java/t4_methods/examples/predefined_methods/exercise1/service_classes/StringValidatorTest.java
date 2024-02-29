package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringValidatorTest {

    @ParameterizedTest
    @CsvSource({"'', false",
                "'first', false",
                "' ', true",
                "' first', true",
                "'third ', true",
                "' first,second,third ', true"
    })

    void hasWhiteSpaces(String input, boolean expected){
        StringValidator stringValidator = new StringValidator();

        boolean result = stringValidator.hasWhiteSpaces(input);

        assertEquals(expected, result);
    }
}
