package io.everyonecodes.java.t7_streams.exercises.set2.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativesTimesNegative2BiggerThan5Test {
    @Test
    void test(){
        List<Double> integerList = List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6);
        Stream<Double> myStream = integerList.stream();

        int result = (int)myStream
                .filter(number -> number < 0)
                .map(number -> number * -2)
                .filter(number -> number > 5)
                .count();

        int expected = 2;

        assertEquals(expected, result);
    }
}
