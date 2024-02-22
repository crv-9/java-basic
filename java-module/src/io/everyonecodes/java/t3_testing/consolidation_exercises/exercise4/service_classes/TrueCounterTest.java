package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise4.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrueCounterTest {

    static Stream<Arguments> parameters_countTrue(){
        return Stream.of(
                Arguments.of(List.of(false, true, false, true),2),
                Arguments.of(List.of(true, true, false, true),3),
                Arguments.of(List.of(false, false),0),
                Arguments.of(List.of(true),1),
                Arguments.of(List.of(),0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_countTrue")
    void countTrueTest(List<Boolean> input, int expected){

        TrueCounter trueCounter = new TrueCounter();


        int result = trueCounter.countTrue(input);

        assertEquals(expected, result);

    }
}
