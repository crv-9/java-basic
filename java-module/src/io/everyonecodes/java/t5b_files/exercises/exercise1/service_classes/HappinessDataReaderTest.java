package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* A method that reads the world-happiness-2017.csv file and returns a list of objects of the type above.
 * */

public class HappinessDataReaderTest {
    String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/world-happiness-2017.csv";
    HappinessDataReader happinessDataReader = new HappinessDataReader();
    @Test
    void reader() throws IOException {
        int resultSize = happinessDataReader.read().size();

        assertEquals(155,resultSize);

        String firstCountry = happinessDataReader.read().getFirst().getCountry();
        assertEquals("Lesotho", firstCountry);

        String lastCountry = happinessDataReader.read().getLast().getCountry();
        assertEquals("Ireland", lastCountry);
    }
}
