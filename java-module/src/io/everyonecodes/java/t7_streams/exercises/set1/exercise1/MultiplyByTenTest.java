package io.everyonecodes.java.t7_streams.exercises.set1.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyByTenTest {
    @Test
    void test(){
        List<Integer> numbers = List.of(-2, -1, 0, 1, 2);
        List<Integer> result = numbers.stream()
                .map(number -> number * 10)
                .toList();

        List<Integer> expected = List.of(-20, -10, 0, 10, 20);

        assertEquals(expected, result);
    }
}
