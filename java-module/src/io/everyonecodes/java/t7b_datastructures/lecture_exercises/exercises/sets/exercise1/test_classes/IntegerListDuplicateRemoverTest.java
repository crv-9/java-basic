package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exercises.sets.exercise1.test_classes;

import io.everyonecodes.java.t7b_datastructures.lecture_exercises.exercises.sets.exercise1.service_classes.IntegerListDuplicateRemover;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerListDuplicateRemoverTest {
    IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();

    @Test
    void remove(){
        List<Integer> integerList = List.of(1,2,3,4,4,5,2,1);

        List<Integer> expectedList = List.of(1,2,3,4,5);
        List<Integer> result = remover.remove(integerList);

        // for visualization purposes
        System.out.println(expectedList);
        System.out.println(result);

        assertEquals(expectedList.size(), result.size());
    }
}
