package io.everyonecodes.java.t7_streams.exercises.set2.exercise5.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes.HappinessDataReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappinnessTopThreeFinderTest {
    HappinnessTopThreeFinder finder = new HappinnessTopThreeFinder();
    HappinessDataReader reader = new HappinessDataReader();


    @Test
    void findTopThree() throws IOException {
        List<String> result = finder.findTopThree(reader.read());

        List<String> expected = List.of(
                "Country: Norway Score: 7.53700017929077",
                "Country: Denmark Score: 7.52199983596802",
                "Country: Iceland Score: 7.50400018692017"
        );


        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
        assertEquals(expected.get(2), result.get(2));

    }
}
