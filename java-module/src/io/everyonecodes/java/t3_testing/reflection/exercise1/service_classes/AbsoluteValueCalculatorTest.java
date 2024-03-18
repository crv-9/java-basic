package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteValueCalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "3, 3",
            "-3, 3",
            "0, 0"
    })

    void calculate(double input, double expected){
        AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

        double result = absoluteValueCalculator.calculate(input);

        assertEquals(expected, result);


    }
}
