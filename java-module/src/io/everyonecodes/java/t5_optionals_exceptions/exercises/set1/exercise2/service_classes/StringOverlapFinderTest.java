package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringOverlapFinderTest {
    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    static Stream<Arguments> parameters_findOverlap(){
        return Stream.of(
                Arguments.of("michael", "elias", "el"),
                Arguments.of("jimbo", "otto", "o")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_findOverlap")
    void findOverlap(String firstString, String secondString, String expected){
        Optional<String> result = stringOverlapFinder.findOverlap(firstString, secondString);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }
}
