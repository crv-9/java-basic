package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileNameValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "PHOTO_10012020.png, true",
            "PHOTO_10012020, false",
            "10012020.png, false",
            "10012020, false"
    })
    void hasProperName (String input, boolean expected){
        FileNameValidator fileNameValidator = new FileNameValidator();

        boolean result = fileNameValidator.hasProperName(input);

        assertEquals(expected, result);
    }
}
