package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemFinderTest {
    ItemFinder itemFinder = new ItemFinder();

    @Test
    void getItem(){
        List<String> inputList = List.of("John", "Sarah", "Joe");
        Optional<String> result = itemFinder.getItem(inputList, 1);

        assertEquals(Optional.of("Sarah"), result);
    }

    @Test
    void getItemEmpty(){
        List<String> inputList = List.of("John", "Sarah", "Joe");
        Optional<String> result = itemFinder.getItem(inputList, 3);

        assertEquals(Optional.empty(), result);
    }

    @Test
    void getItem2(){
        List<String> inputList = List.of("John", "Sarah", "Joe");
        Optional<String> result = itemFinder.getItem2(inputList, 1);

        assertEquals(Optional.of("Sarah"), result);
    }

    @Test
    void getItem2Empty(){
        List<String> inputList = List.of("John", "Sarah", "Joe");
        Optional<String> result = itemFinder.getItem2(inputList, 3);

        assertEquals(Optional.empty(), result);
    }

}
