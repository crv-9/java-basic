package io.everyonecodes.java.consolidations.consolidation1.set2.exercise1.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialNumbersCounterTest {

    SpecialNumbersCounter counter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "333, 3",
            "0123, 1",
            "-369, 3",
            "458, 0",
            "0,0",
            "123456789123456, 5"

    })
    void testNormalCase(long input, int expected){
        int result = counter.count(input);

        assertEquals(expected, result);
    }
}
