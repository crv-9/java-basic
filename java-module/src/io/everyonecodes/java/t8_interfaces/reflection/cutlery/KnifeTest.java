package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Fork;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Knife;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KnifeTest {
    Knife knife = new Knife();
    @Test
    void testForkExpected(){

        String resultName = knife.getName();
        String expectedName = "Knife";


        assertEquals(expectedName, resultName);
        assertTrue(knife.isUsedFor("Pizza"));
        assertTrue(knife.isUsedFor("Fish"));


    }

    @Test
    void testForkWrong(){

        assertFalse(knife.isUsedFor("SOUP"));
        assertFalse(knife.isUsedFor("Sushi"));

    }
}
