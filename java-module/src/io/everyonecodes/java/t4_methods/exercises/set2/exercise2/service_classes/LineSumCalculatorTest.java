package io.everyonecodes.java.t4_methods.exercises.set2.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineSumCalculatorTest {

    static Stream<Arguments> parameters_calculateSum(){
        return Stream.of(
                Arguments.of("1;2;3", 6),
                Arguments.of("11;22;33", 66),
                Arguments.of("0;0;7", 7)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_calculateSum")
    void calculateSum(String input, int expected){
        LineSumCalculator lineSumCalculator = new LineSumCalculator();

        int result = lineSumCalculator.calculateSum(input);

        assertEquals(expected,result);
    }
}
