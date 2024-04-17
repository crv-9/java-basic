package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.data_classes.Safe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThiefAttemptCounterTest {
    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    @Test
    void counterAdvanced(){
        int result = counter.countAttempts(new Safe(10), new AdvancedThief());

        assertEquals(5, result);

    }
    @Test
    void counterBeginner(){
        int result = counter.countAttempts(new Safe(10), new BeginnerThief());

        assertEquals(10, result);

    }
}
