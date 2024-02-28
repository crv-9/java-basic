package io.everyonecodes.java.t4_methods.exercises.set2.exercise5.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipAdderTest {

    @ParameterizedTest
    @CsvSource({
            "23.14, 24.50",
            "2.45, 3.0",
            "11.00, 12.00"
    })
    void add(double input, double expected){
        TipAdder tipAdder = new TipAdder();

        double result = tipAdder.add(input);

        assertEquals(expected, result);
    }
}
