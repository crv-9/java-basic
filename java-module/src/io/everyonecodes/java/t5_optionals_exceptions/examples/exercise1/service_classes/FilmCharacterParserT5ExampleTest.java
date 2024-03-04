package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise1.service_classes;

import io.everyonecodes.java.t4_methods.exercises.set1.exercise4.data_classes.FilmCharacter;
import io.everyonecodes.java.t4_methods.exercises.set1.exercise4.service_classes.FilmCharacterParser;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static io.everyonecodes.java.t5_optionals_exceptions.examples.exercise1.service_classes.FilmCharacterParserT5Example.parser2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilmCharacterParserT5ExampleTest {
    FilmCharacterParserT5Example filmCharacterParserT5Example = new FilmCharacterParserT5Example();

    static Stream<Arguments> parameters_parser(){
        return Stream.of(
                Arguments.of("Anakin;Skywalker", new FilmCharacter("Anakin", "Skywalker")),
                Arguments.of("Frodo;Baggins", new FilmCharacter("Frodo", "Baggins")),
                Arguments.of("Spongebob;Squarepants", new FilmCharacter("Spongebob", "Squarepants"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_parser")
    void parser2_correct_input(String input, FilmCharacter expected){
        FilmCharacter result = filmCharacterParserT5Example.parser(input);

        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getLastName(), result.getLastName());
    }

    @ParameterizedTest
    @CsvSource({
            "wrongDataNoSemiColon",
            ";NameLess",
            "Mister;"
    })
    void parser2_wrong_input(String input) {
        Optional<FilmCharacter> oResult = filmCharacterParserT5Example.parser2(input);

        assertTrue(oResult.isEmpty());
    }
}
