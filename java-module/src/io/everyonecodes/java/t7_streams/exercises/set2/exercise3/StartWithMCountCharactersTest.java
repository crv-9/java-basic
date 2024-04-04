package io.everyonecodes.java.t7_streams.exercises.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
* stream that reads the data from the list,
* and keeps the ones that start with "M",
* transforms them to their lengths and finally returns the sum of all those values.
 */


public class StartWithMCountCharactersTest {
    @Test
    void test(){
        List<String> namesList = List.of("Mary", "Joe", "Max", "Laura");

        Stream<String> myStream = namesList.stream();

        int result = myStream
                .filter(name -> name.startsWith("M"))
                .map(String::length)// here I am going through every string and getting its length
                .reduce(0, Integer::sum) // here I am going through every single int and adding it - 0 indicates initial value to add on
        ;

        int expected = 7;

        assertEquals(expected, result);

    }
}
