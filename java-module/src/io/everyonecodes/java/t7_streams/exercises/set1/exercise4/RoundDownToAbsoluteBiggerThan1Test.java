package io.everyonecodes.java.t7_streams.exercises.set1.exercise4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoundDownToAbsoluteBiggerThan1Test {
    @Test
    void test(){
        List<Double> numbers = List.of(1.5, -1.8, 3.5);
        Double result = numbers.stream()
                .map(Math::floor) // using method reference instead of lambda (number -> Math.round(number))
                .map(Math::abs) // using method reference instead of lambda (number -> Math.abs(number))
                .filter(number -> number > 1)
                .findFirst().get();

        Double expected = 2.0;

        assertEquals(expected, result);
    }
}
