package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise8.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AboveAverageCounterTest {

    static Stream<Arguments> parameters_countAboveAverage(){
        return Stream.of(
                Arguments.of(List.of(3.0, 4.0, 6.0, 1.0, 9.0), 2),
                Arguments.of(List.of(3.5), 0),
                Arguments.of(List.of(1.5, 7.0, 9.5, 4.0), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_countAboveAverage")
    void countAboveAverage(List<Double> input, int expected){

        AboveAverageCounter aboveAverageCounter = new AboveAverageCounter();

        int result = aboveAverageCounter.countAboveAverage(input);

        assertEquals(expected, result);
    }

}
