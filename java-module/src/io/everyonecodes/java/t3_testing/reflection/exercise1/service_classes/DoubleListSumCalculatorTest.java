package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleListSumCalculatorTest {
    static Stream<Arguments> parameters_doubleListSumCalc(){
        return Stream.of(
                Arguments.of(List.of(), 0),
                Arguments.of(List.of(1.0, 2.0), 3.0),
                Arguments.of(List.of(1.1, 2.2, 3.3), 6.6)
        );
    }


    @ParameterizedTest
    @MethodSource("parameters_doubleListSumCalc")
    void calculate(List<Double> input, double expected){

        DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

        double result = doubleListSumCalculator.calculate(input);

        assertEquals(expected, result);

    }

}
