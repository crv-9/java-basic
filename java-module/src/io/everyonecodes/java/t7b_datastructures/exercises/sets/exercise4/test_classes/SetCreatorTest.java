package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise4.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise4.service_classes.SetCreator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetCreatorTest {
    SetCreator creator = new SetCreator();

    List<Integer> twoEmptyListsA = new ArrayList<>(List.of());
    List<Integer> twoEmptyListsB = new ArrayList<>(List.of());
    List<Integer> oneEmptyListA = new ArrayList<>(List.of(1));
    List<Integer> oneEmptyListB = new ArrayList<>(List.of());
    List<Integer> differentListsA = new ArrayList<>(List.of(1));
    List<Integer> differentListsB = new ArrayList<>(List.of(2));
    List<Integer> oneCommonA = new ArrayList<>(List.of(1,2));
    List<Integer> oneCommonB = new ArrayList<>(List.of(3,2));
    List<Integer> twoCommonRepeatedA = new ArrayList<>(List.of(1,1,1,2,3));
    List<Integer> twoCommonRepeatedB = new ArrayList<>(List.of(2, 2, 3,4));


    @Test
    void getCommonNumbers_emptyLists(){

        Set<Integer> result = creator.getCommonNumbers(twoEmptyListsA, twoEmptyListsB);

        Set<Integer> expected = new HashSet<>(Set.of());

        assertEquals(expected, result);
    }
    @Test
    void getCommonNumbers_oneEmptyList(){

        Set<Integer> result = creator.getCommonNumbers(oneEmptyListA, oneEmptyListB);

        Set<Integer> expected = new HashSet<>(Set.of());

        assertEquals(expected, result);
    }
    @Test
    void getCommonNumbers_differentLists(){

        Set<Integer> result = creator.getCommonNumbers(differentListsA, differentListsB);

        Set<Integer> expected = new HashSet<>(Set.of());

        assertEquals(expected, result);
    }
    @Test
    void getCommonNumbers_oneCommon(){

        Set<Integer> result = creator.getCommonNumbers(oneCommonA, oneCommonB);

        Set<Integer> expected = new HashSet<>(Set.of(2));

        assertEquals(expected, result);
    }
    @Test
    void getCommonNumbers_twoCommonRepeated(){

        Set<Integer> result = creator.getCommonNumbers(twoCommonRepeatedA, twoCommonRepeatedB);

        Set<Integer> expected = new HashSet<>(Set.of(2,3));

        assertEquals(expected, result);
    }

    // ----- Distinct

    @Test
    void getDistinctNumbers_emptyLists(){

        Set<Integer> result = creator.getDistinctNumbers(twoEmptyListsA, twoEmptyListsB);

        Set<Integer> expected = new HashSet<>(Set.of());

        assertEquals(expected, result);
    }
    @Test
    void getDistinctNumbers_oneEmptyList(){

        Set<Integer> result = creator.getDistinctNumbers(oneEmptyListA, oneEmptyListB);

        Set<Integer> expected = new HashSet<>(Set.of(1));

        assertEquals(expected, result);
    }
    @Test
    void getDistinctNumbers_differentLists(){

        Set<Integer> result = creator.getDistinctNumbers(differentListsA, differentListsB);

        Set<Integer> expected = new HashSet<>(Set.of(1,2));

        assertEquals(expected, result);
    }
    @Test
    void getDistinctNumbers_oneCommon(){

        Set<Integer> result = creator.getDistinctNumbers(oneCommonA, oneCommonB);

        Set<Integer> expected = new HashSet<>(Set.of(1,3));

        assertEquals(expected, result);
    }
    @Test
    void getDistinctNumbers_twoCommonRepeated(){

        Set<Integer> result = creator.getDistinctNumbers(twoCommonRepeatedA, twoCommonRepeatedB);

        Set<Integer> expected = new HashSet<>(Set.of(1,4));

        assertEquals(expected, result);
    }
}
