package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerListDescendingSorterTest {
    static Stream<Arguments> parameters_sorter(){
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(8,7,9)), List.of(9,8,7)),
                Arguments.of(new ArrayList<>(List.of(1,5,9)), List.of(9,5,1)),
                Arguments.of(new ArrayList<>(List.of(8,7,9,4,3,2)), List.of(9,8,7,4,3,2))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_sorter")
    void listSorter(List<Integer> input, List<Integer> expected){
        IntegerListDescendingSorter integerListDescendingSorter = new IntegerListDescendingSorter();

        List<Integer> result = integerListDescendingSorter.sorterListDescending(input);

        assertEquals(expected,result);
    }

}
