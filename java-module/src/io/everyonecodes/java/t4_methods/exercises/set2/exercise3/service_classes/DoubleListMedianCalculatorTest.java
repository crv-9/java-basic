package io.everyonecodes.java.t4_methods.exercises.set2.exercise3.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleListMedianCalculatorTest {
    static Stream<Arguments> parameters_calculateMedia(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1.0, 2.0, 3.0)), 2.0),
                Arguments.of(new ArrayList<>(List.of(1.0, 3.0, 2.0)), 2.0),
                Arguments.of(new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0)), 2.5),
                Arguments.of(new ArrayList<>(List.of(11.0, 33.0, 22.0)), 22.0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_calculateMedia")
    void calculateMedian(List<Double> input, double expected){
        DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();

        double result = doubleListMedianCalculator.calculateMedian(input);

        assertEquals(expected, result);
    }
}
