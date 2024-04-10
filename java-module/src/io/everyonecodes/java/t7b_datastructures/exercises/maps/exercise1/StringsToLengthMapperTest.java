package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsToLengthMapperTest {
    StringsToLengthMapper mapper = new StringsToLengthMapper();

    @Test
    void map(){
        List<String> stringList = List.of("hi", "there");

        Map<String, Integer> result = mapper.map(stringList);

        Map<String, Integer> expected = Map.of("hi",2, "there",5);

        // how come both work?
        assertEquals(new HashMap<>(expected), new HashMap<>(result));
        assertEquals(expected,result);

    }
}
