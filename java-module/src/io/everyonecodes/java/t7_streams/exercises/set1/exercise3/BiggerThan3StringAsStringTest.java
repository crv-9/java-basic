package io.everyonecodes.java.t7_streams.exercises.set1.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BiggerThan3StringAsStringTest {
    @Test
    void test(){
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5);
        List<String> result = numbers.stream()
                .filter(number -> number > 3)
                .map(String::valueOf)
                .toList();

        List<String> expected = List.of("4", "5");

        assertEquals(expected, result);
    }
}
