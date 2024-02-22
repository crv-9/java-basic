package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    static Stream<Arguments> parameters_AddNumbers(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1)), 1),
                Arguments.of(new ArrayList<>(List.of(1,2)), 3),
                Arguments.of(new ArrayList<>(List.of(1,2,3,4)), 10)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_AddNumbers")
    void addNumbersTest(List<Integer> input, int expected){

        Addition addition = new Addition();

        int result = addition.addNumbers(input);

        assertEquals(expected, result);
    }

    }

