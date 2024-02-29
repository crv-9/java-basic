package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwoDecimalsExtractorTest {
    @ParameterizedTest
    @CsvSource({
            "1.0, 0",
            "0.34, 34",
            "0, 0"
    })

    void extractTwoDecimals(double input, double expected){
        FirstTwoDecimalsExtractor firstTwoDecimalsExtractor = new FirstTwoDecimalsExtractor();

        double result = firstTwoDecimalsExtractor.extractTwoDecimals(input);

        assertEquals(expected, result);
    }
}
