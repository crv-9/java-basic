package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Fork;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ForkTest {
    Fork fork = new Fork();
    @Test
    void testForkExpected(){

        String resultName = fork.getName();
        String expectedName = "Fork";


        assertEquals(expectedName, resultName);
        assertTrue(fork.isUsedFor("Pasta"));
        assertTrue(fork.isUsedFor("Pizza"));
        assertTrue(fork.isUsedFor("Fish"));


    }

    @Test
    void testForkWrong(){

        assertFalse(fork.isUsedFor("SOUP"));
        assertFalse(fork.isUsedFor("Sushi"));

    }
}
