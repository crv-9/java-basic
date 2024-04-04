package io.everyonecodes.java.t7_streams.exercises.set1.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KeepPositivesTest {
    @Test
    void test(){
        List<Integer> numbers = List.of(-1, 0, 1, 2, 3);
        List<Integer> result = numbers.stream()
                .filter(number -> number > 0)
                .toList();

        List<Integer> expected = List.of(1, 2, 3);

        assertEquals(expected, result);
    }
}
