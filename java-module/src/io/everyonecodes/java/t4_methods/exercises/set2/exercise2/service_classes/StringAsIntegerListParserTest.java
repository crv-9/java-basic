package io.everyonecodes.java.t4_methods.exercises.set2.exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAsIntegerListParserTest {
    static Stream<Arguments> parameters_parser(){
        return Stream.of(
                Arguments.of("1;2;3", List.of(1,2,3)),
                Arguments.of("11;22;33", List.of(11,22,33)),
                Arguments.of("0;0;7", List.of(0,0,7))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_parser")
    void parser(String input, List<Integer> expected){
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

        List<Integer> result = stringAsIntegerListParser.parse(input);

        assertEquals(expected, result);
    }
}
