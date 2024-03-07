package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "some-example, some",
            "some-other-example, some"
    })
    void extract(String input, String expected){
        Optional<String> oResult = beforeDashExtractor.extract(input);

        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "NoDash",
            "''"
    })
    void extractNoDash(String input){
        Optional<String> oResult = beforeDashExtractor.extract(input);

        assertTrue(oResult.isEmpty());
    }
}
