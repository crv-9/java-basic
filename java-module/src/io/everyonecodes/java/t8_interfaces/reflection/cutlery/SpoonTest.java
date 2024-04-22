package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Spoon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpoonTest {
    Spoon spoon = new Spoon();
    @Test
    void testForkExpected(){

        String resultName = spoon.getName();
        String expectedName = "Spoon";


        assertEquals(expectedName, resultName);
        assertTrue(spoon.isUsedFor("Soup"));
        assertTrue(spoon.isUsedFor("SOUP"));

    }

    @Test
    void testForkWrong(){
        
        assertFalse(spoon.isUsedFor("Pizza"));
        assertFalse(spoon.isUsedFor("Sushi"));

    }
}
