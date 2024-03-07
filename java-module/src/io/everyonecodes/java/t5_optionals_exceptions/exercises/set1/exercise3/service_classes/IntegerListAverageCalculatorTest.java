package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise3.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();
    static Stream<Arguments> parameters_calculateAverage(){
        return Stream.of(
                Arguments.of(List.of(1,2,3),2.0),
                Arguments.of(List.of(2,4,6),4.0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_calculateAverage")
    void calculateAverage(List<Integer> inputList, double expected){
        Optional<Double> result = integerListAverageCalculator.calculateAverage(inputList);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void calculateAverageEmpty(){
        Optional<Double> result = integerListAverageCalculator.calculateAverage(List.of());
        assertTrue(result.isEmpty());
    }
}
