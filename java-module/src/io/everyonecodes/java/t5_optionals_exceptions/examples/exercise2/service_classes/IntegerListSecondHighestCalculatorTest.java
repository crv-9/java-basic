package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerListSecondHighestCalculatorTest {
    IntegerListSecondHighestCalculator integerListSecondHighestCalculator = new IntegerListSecondHighestCalculator();
    static Stream<Arguments> parameters_calculate(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 5, 7, 11)), 7),
                Arguments.of(new ArrayList<>(List.of(2, 4, 6, 10, 14, 22)), 14),
                Arguments.of(new ArrayList<>(List.of(22, 14, 10, 6, 4, 2)), 14)
        );
    }
    @ParameterizedTest
    @MethodSource("parameters_calculate")
    void calculate_correct(List<Integer> input, Integer expected){
        Optional<Integer> oResult = integerListSecondHighestCalculator.calculate(input);

        assertTrue(oResult.isPresent()); // Why do I need to add this assertion?
        assertEquals(expected, oResult.get());
    }

    static Stream<Arguments> parameters_calculate2(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(11))),
                Arguments.of(new ArrayList<>(List.of()))
        );
    }
    @ParameterizedTest
    @MethodSource("parameters_calculate2")
    void calculate_wrong(List<Integer> input){
        Optional<Integer> oResult = integerListSecondHighestCalculator.calculate(input);

        assertTrue(oResult.isEmpty());
    }


}
