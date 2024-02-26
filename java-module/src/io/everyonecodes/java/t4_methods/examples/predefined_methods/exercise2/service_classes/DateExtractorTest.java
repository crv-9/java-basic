package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateExtractorTest {

    @ParameterizedTest
    @CsvSource({
            "PHOTO_10012020.png, 10012020",
            "PHOTO_10012023.png, 10012023",
            "PHOTO_10012025.png, 10012025",

    })
    void extractDate(String input, String expected){
        DateExtractor dateExtractor = new DateExtractor();

        String result = dateExtractor.extractDate(input);

        assertEquals(expected, result);
    }

}
