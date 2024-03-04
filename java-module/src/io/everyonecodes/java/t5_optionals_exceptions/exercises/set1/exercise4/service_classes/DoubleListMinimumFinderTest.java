package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise4.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoubleListMinimumFinderTest {
    DoubleListMinimumFinder doubleListMinimumFinder = new DoubleListMinimumFinder();
    static Stream<Arguments> parameters_findMin(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1.0, 2.0, 3.0)), 1.0),
                Arguments.of(new ArrayList<>(List.of(5.0, 9.0, 4.0)), 4.0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_findMin")
    void findMin(List<Double> input, double expected){
        Optional<Double> result = doubleListMinimumFinder.findMin(input);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void findMinEmptyList(){
        Optional<Double> result = doubleListMinimumFinder.findMin(new ArrayList<>(List.of()));
        assertTrue(result.isEmpty());
    }
}
