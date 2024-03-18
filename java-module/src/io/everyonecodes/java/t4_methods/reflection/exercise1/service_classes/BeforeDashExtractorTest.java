package io.everyonecodes.java.t4_methods.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my-string, my",
            "Some-example, Some",
            "this has no dash, ''"
    })
    void extract(String input, String expected){
        String result = beforeDashExtractor.extract(input);

        assertEquals(expected, result);
    }
}
