package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();
    static Stream<Arguments> parameters_line(){
        return Stream.of(
                Arguments.of(List.of("1;2;3;4", "2;3;4"), List.of("10", "9"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_line")
    void calculateLineSum(List<String> input, List<String> expected){
        List<String> result = linesCalculator.calculateLineSum(input);

        assertEquals(expected, result);

    }
}
