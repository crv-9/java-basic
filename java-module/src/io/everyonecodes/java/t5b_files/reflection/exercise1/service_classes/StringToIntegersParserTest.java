package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringToIntegersParserTest {

    StringToIntegersParser parser = new StringToIntegersParser();

    static Stream<Arguments> parameters_parser(){
        return Stream.of(
                Arguments.of("1;2;3;4", List.of(1, 2, 3, 4)),
                Arguments.of("-1;2;3;4", List.of(-1, 2, 3, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_parser")
    void parselineSuccess(String line, List<Integer> expected){
        Optional<List<Integer>> oResult = parser.parseLine(line);

        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());

    }

    @Test
    void parseTestEmptyString(){
        Optional<List<Integer>> oResult = parser.parseLine("");

        assertTrue(oResult.isEmpty());
    }

    @Test
    void parseTestCorruptString(){
        Optional<List<Integer>> oResult = parser.parseLine("-1;ab;0");
        List<Integer> expected = List.of(-1,0);

        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }
}
