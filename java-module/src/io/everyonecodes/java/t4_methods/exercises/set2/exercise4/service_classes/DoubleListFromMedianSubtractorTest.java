package io.everyonecodes.java.t4_methods.exercises.set2.exercise4.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleListFromMedianSubtractorTest {
    static Stream<Arguments> parameters_calculateDifference() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1.0, 2.0, 3.0)), List.of(-1.0, 0.0, 1.0)),
                Arguments.of(new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0)), List.of(-1.5, -0.5, 0.5, 1.5)),
                Arguments.of(new ArrayList<>(List.of(11.0, 33.0, 22.0)), List.of(-11.0, 0.0, 11.0))
        );
    }


    @ParameterizedTest
    @MethodSource("parameters_calculateDifference")
    void calculate(List<Double> input, List<Double> expected) {
        DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();

        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        assertEquals(expected, result);
    }
}