package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise5.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutlierRemoverTest {
    static Stream<Arguments> parameters_removeOutliers(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(3, 5, 1, 3, 9)), List.of(3, 5, 3)),
                Arguments.of(new ArrayList<>(List.of(3, 5, 1, 3, 9, 1)), List.of(3, 5, 3, 1)),
                Arguments.of(new ArrayList<>(List.of(1, 1 , 1)), List.of(1)),
                Arguments.of(new ArrayList<>(List.of(1, 3)), List.of(1, 3)),
                Arguments.of(new ArrayList<>(List.of(6)), List.of(6)),
                Arguments.of(new ArrayList<>(List.of(1, 5, 3)), List.of(3))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_removeOutliers")
    void removeOutliersTest(List<Integer> input, List<Integer> expected){

        OutlierRemover outlierRemover = new OutlierRemover();

        List<Integer> result = outlierRemover.removeOutliers(input);

        assertEquals(expected, result);

    }
}
