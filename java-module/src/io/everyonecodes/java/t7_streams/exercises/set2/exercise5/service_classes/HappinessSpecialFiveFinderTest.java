package io.everyonecodes.java.t7_streams.exercises.set2.exercise5.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes.HappinessDataReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappinessSpecialFiveFinderTest {
    HappinessSpecialFiveFinder finder = new HappinessSpecialFiveFinder();
    HappinessDataReader reader = new HappinessDataReader();


    @Test
    void findSpecialFive() throws IOException {
        List<String> result = finder.findSpecialFive(reader.read());

        List<String> expected = List.of(
                "Country: Burkina Faso Rank: 134",
                "Country: Afghanistan Rank: 141",
                "Country: Madagascar Rank: 144",
                "Country: South Sudan Rank: 147",
                "Country: Central African Republic Rank: 155"
        );

        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
        assertEquals(expected.get(2), result.get(2));
        assertEquals(expected.get(3), result.get(3));
        assertEquals(expected.get(4), result.get(4));
    }
}
