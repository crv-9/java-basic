package io.everyonecodes.java.t7_streams.exercises.set2.exercise2;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortFirst4Test {
    @Test
    void test(){
        List<Integer> integerList = List.of(-2, -1, 5, 2, -5, 4);
        Stream<Integer> myStream = integerList.stream();

        List<Integer> result = myStream
                .sorted()
                .limit(4)
                .toList();

        List<Integer> expected = List.of(-5, -2, -1, 2);

        assertEquals(expected, result);
    }
}
