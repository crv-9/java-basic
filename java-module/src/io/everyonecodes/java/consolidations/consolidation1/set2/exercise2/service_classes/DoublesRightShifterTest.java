package io.everyonecodes.java.consolidations.consolidation1.set2.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublesRightShifterTest {
    DoublesRightShifter doublesShifter = new DoublesRightShifter();

    static Stream<Arguments> parameters_shiftOne(){
        return Stream.of(
                Arguments.of(List.of(1.0,2.0,3.0), List.of(2.0,3.0,1.0)),
                Arguments.of(List.of(1.0,2.0,3.0,4.0,5.0), List.of(4.0,5.0,1.0,2.0,3.0)),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_shiftOne")
    void shiftOne(List<Double> inputList, List<Double> expected){
        List<Double> result = doublesShifter.shiftTwo(inputList);

        assertEquals(expected, result);
    }

}
