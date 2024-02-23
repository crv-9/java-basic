package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoundToEuroConverterTest {

    @ParameterizedTest
    @CsvSource({
            "1, 0.85",
            "2, 1.7",
            "3, 2.55"
    })

    void converter(double input, double expected){
        PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

        double result = poundToEuroConverter.convert(input);

        assertEquals(expected, result);


    }
}
