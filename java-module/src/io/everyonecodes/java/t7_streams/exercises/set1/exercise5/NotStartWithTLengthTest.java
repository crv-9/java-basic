package io.everyonecodes.java.t7_streams.exercises.set1.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotStartWithTLengthTest {
    @Test
    void test(){
        Stream<String> streamOfString = Stream.of("Hello", "there", "General", "Kenobi");
        List<Integer> result = streamOfString
                .filter(string -> !string.startsWith("t"))
                .map(String::length) // used method reference instead of lambda (string -> string.length)
                .toList();

        List<Integer> expected = List.of(5, 7, 6);

        assertEquals(expected, result);
    }
}
