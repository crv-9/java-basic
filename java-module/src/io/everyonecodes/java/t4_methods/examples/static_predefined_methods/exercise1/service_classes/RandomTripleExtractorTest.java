package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise1.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTripleExtractorTest {

    @Test
    void randomExtractor(){
        RandomTripleExtractor randomTripleExtractor = new RandomTripleExtractor();
        List<Integer> integerList = List.of(1,3,5,7,9);

        List<Integer> result = randomTripleExtractor.randomExtractor(integerList);


        assertEquals(3, result.size());
        for (int number: result) {
            assertTrue(result.contains(number));
        }
    }
}
