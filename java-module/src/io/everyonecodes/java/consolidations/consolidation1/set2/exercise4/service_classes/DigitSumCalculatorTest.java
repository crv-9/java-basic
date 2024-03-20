package io.everyonecodes.java.consolidations.consolidation1.set2.exercise4.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumCalculatorTest {
    DigitSumCalculator calculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "248102, 17",
            "1292, 14",
            "39, 12",
            "0, 0",
            "1220030100102, 12"
    })

    void calculateNormal(long input, int expected){
        int result = calculator.calculate(input);

        assertEquals(expected, result);
    }
}
