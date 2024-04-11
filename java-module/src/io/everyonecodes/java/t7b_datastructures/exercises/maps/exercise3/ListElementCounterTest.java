package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListElementCounterTest {
    ListElementCounter counter = new ListElementCounter();

    @Test
    void countNumbers_SingleElement(){
        List<Integer> integerListTest = List.of(1);

        Map<Integer, Integer> result = counter.countNumbers(integerListTest);
        Map<Integer, Integer> expected = Map.of(1,1);

        assertEquals(expected, result);
    }
    @Test
    void countNumbers_oneElementRepeating(){
        List<Integer> integerListTest = List.of(1,1,1);

        Map<Integer, Integer> result = counter.countNumbers(integerListTest);
        Map<Integer, Integer> expected = Map.of(1,3);

        assertEquals(expected, result);
    }
    @Test
    void countNumbers_twoElements(){
        List<Integer> integerListTest = List.of(1,1,1,2,2);

        Map<Integer, Integer> result = counter.countNumbers(integerListTest);
        Map<Integer, Integer> expected = Map.of(1,3, 2,2);

        assertEquals(expected, result);
    }
    @Test
    void countWords_SingleElement(){
        List<String> stringList = List.of("hi");

        Map<String, Integer> result = counter.countWords(stringList);
        Map<String, Integer> expected = Map.of("hi",1);

        assertEquals(expected, result);
    }
    @Test
    void countWords_oneElementRepeating(){
        List<String> stringList = List.of("hi", "hi");

        Map<String, Integer> result = counter.countWords(stringList);
        Map<String, Integer> expected = Map.of("hi",2);

        assertEquals(expected, result);
    }
    @Test
    void countWords_twoElements(){
        List<String> stringList = List.of("hi", "hi", "hello");

        Map<String, Integer> result = counter.countWords(stringList);
        Map<String, Integer> expected = Map.of("hi",2, "hello", 1);

        assertEquals(expected, result);
    }
}
