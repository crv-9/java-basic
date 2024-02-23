package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoundToEuroConverterTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1.1764705882352942",
            "2, 2.3529411764705883",
            "100, 117.64705882352942"
    })

    void converter(double input, double expected){
        PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

        double result = poundToEuroConverter.convert(input);

        assertEquals(expected, result);


    }
}
