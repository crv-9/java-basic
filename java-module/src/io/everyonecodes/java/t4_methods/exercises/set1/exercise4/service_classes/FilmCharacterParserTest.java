package io.everyonecodes.java.t4_methods.exercises.set1.exercise4.service_classes;

import io.everyonecodes.java.t4_methods.exercises.set1.exercise4.data_classes.FilmCharacter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmCharacterParserTest {
    static Stream<Arguments> parameters_parser(){
        return Stream.of(
                Arguments.of("Anakin;Skywalker", new FilmCharacter("Anakin", "Skywalker")),
                Arguments.of("Frodo;Baggins", new FilmCharacter("Frodo", "Baggins")),
                Arguments.of("Spongebob;Squarepants", new FilmCharacter("Spongebob", "Squarepants"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_parser")
    void parser(String input, FilmCharacter expected){
        FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

        FilmCharacter result = filmCharacterParser.parser(input);

        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getLastName(), result.getLastName());

    }
}
