package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation2_exercise2.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizerTest {

    static Stream<Arguments> parameters_split(){
        return Stream.of(
                Arguments.of("carlos", new ArrayList<>(List.of("Car", "Los"))),
                Arguments.of("roberto", new ArrayList<>(List.of("Robe", "Rto"))),
                Arguments.of("this is a sentence.", new ArrayList<>(List.of("This is a ", "Sentence.")))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_split")
    void splitInHalfandCapitalize(String inputWord, List<String> expected){
        Capitalizer capitalizer = new Capitalizer();

        List<String> result = capitalizer.splitInHalfAndCapitalize(inputWord);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "car, Car",
            "los, Los",
            "robe, Robe",
            "rto, Rto"
    })
    void capitalize(String input, String expected){

        Capitalizer capitalizer = new Capitalizer();

        String result = capitalizer.capitalize(input);

        assertEquals(expected, result);

    }

}
