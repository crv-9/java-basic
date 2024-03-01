package io.everyonecodes.java.t4_methods.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FromZeroRounderTest {
    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "0.0, 0.0",
            "-4.55, -5.0",
            "4.3, 5.0",
            "3.0, 3.0"
    })

    void round(double input, double expected){
        double result = fromZeroRounder.round(input);

        assertEquals(expected, result);
    }
}
