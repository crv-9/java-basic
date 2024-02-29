package io.everyonecodes.java.t4_methods.exercises.set2.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTitleFormatterTest {

    @ParameterizedTest
    @CsvSource({
            "finding nemo, Finding Nemo",
            "the pink panther, The Pink Panther",
            "toy story, Toy Story"
    })

    void format(String input, String expected) {
        MovieTitleFormatter movieTitleFormatter = new MovieTitleFormatter();

        String result = movieTitleFormatter.format(input);

        assertEquals(expected, result);
    }
}
