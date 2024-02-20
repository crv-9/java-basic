package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1b.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1b.service_classes.NumberSorter.returnGreatestNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSorterTest {

    static Stream<Arguments> parameters_gatherNumbers(){
        return Stream.of(
                Arguments.of(List.of(1),1),
                Arguments.of(new ArrayList<>(List.of(1,2,3)),3),
                Arguments.of(new ArrayList<>(List.of(-3, -2, -1)),-1),
                Arguments.of(new ArrayList<>(List.of(1, 1, 1, 2)),2),
                Arguments.of(new ArrayList<>(List.of(-1, 1)),1)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_gatherNumbers")
    void findGreatest(List<Integer> input, double expected){
        int result = returnGreatestNumber(input);
        assertEquals(expected, result);

    }
}
