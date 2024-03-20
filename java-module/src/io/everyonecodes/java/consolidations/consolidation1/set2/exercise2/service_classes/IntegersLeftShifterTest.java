package io.everyonecodes.java.consolidations.consolidation1.set2.exercise2.service_classes;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegersLeftShifterTest {
    IntegersLeftShifter intShifter = new IntegersLeftShifter();

    static Stream<Arguments> parameters_shiftOne(){
        return Stream.of(
                Arguments.of(List.of(1,2,3), List.of(2,3,1)),
                Arguments.of(List.of(1,2,3,4,5), List.of(2,3,4,5,1))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_shiftOne")
    void shiftOne(List<Integer> inputList, List<Integer> expected){
        List<Integer> result = intShifter.shiftOne(inputList);

        assertEquals(expected, result);
    }
}
