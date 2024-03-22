package io.everyonecodes.java.evaluations.evaluation1.exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCounterTest {
    VowelCounter counter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "carlos, 2",
            "CARLOS, 2",
            "caarloos, 4",
            "CaARLoOS, 4",
            "bedi, 2",
            "ruzica, 3",
    })
    void count(String string, int expected){
        int result = counter.count(string);

        assertEquals(expected, result);
    }

    @Test
    void countEmptyString(){
        int result = counter.count("");
        assertEquals(0,result);
    }
}
