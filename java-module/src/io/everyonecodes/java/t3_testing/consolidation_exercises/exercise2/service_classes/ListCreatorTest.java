package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes.ListCreator.createList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCreatorTest {
    static Stream<Arguments> parameters_createList(){
        return Stream.of(
                Arguments.of(1,new ArrayList<>(List.of(1))),
                Arguments.of(3, new ArrayList<>(List.of(1,2,3))),
                Arguments.of(6, new ArrayList<>(List.of(1, 2, 3, 4, 5, 6)))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_createList")

    void createListTest(int input , List<Integer> expected){
        List<Integer> result = createList(input);
        assertEquals(expected, result);
    }




}
