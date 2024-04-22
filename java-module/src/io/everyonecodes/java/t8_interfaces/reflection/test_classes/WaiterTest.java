package io.everyonecodes.java.t8_interfaces.reflection.test_classes;

import io.everyonecodes.java.t8_interfaces.reflection.service_classes.Waiter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WaiterTest {

    Waiter waiter = new Waiter();

    @Test
    void testWaiterCorrectFish(){

        List<String> result = waiter.getCutlery("fish");

        List<String> expectedList = List.of("Fork", "Knife");

        assertTrue(expectedList.containsAll(result));

    }
    @Test
    void testWaiterCorrectPasta(){

        List<String> result = waiter.getCutlery("PASTA");

        List<String> expectedList = List.of("Fork", "Knife");

        assertTrue(expectedList.containsAll(result));

    }
    @Test
    void testWaiterCorrectSoup(){

        List<String> result = waiter.getCutlery("soup");

        List<String> expectedList = List.of("Spoon");

        assertTrue(expectedList.containsAll(result));

    }
    @Test
    void testWaiterEmpty(){

        List<String> result = waiter.getCutlery("sushi");

        List<String> expectedList = List.of("");

        assertTrue(expectedList.containsAll(result));

    }

}
