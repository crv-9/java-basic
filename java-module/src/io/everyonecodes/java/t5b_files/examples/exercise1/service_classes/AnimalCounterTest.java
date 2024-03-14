package io.everyonecodes.java.t5b_files.examples.exercise1.service_classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalCounterTest {
    AnimalCounter animalCounter = new AnimalCounter();

    @Test
    void count() throws IOException {
        int result = animalCounter.count();

        int expected = 3;

        assertEquals(expected, result);
    }
}
