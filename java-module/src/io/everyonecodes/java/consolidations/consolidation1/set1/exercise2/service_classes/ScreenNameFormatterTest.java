package io.everyonecodes.java.consolidations.consolidation1.set1.exercise2.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.data_classes.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ScreenNameFormatterTest {
    ScreenNameFormatter formatter = new ScreenNameFormatter();

    @Test
    void createNormalFirstClass(){
        Customer customer = new Customer("carlos", true);
        String expected = "CARLOS";

        String result = formatter.create(customer);

        assertEquals(expected, result);
    }

    @Test
    void createNormalSecondClass(){
        Customer customer = new Customer("Carlos", false);
        String expected = "carlos";

        String result = formatter.create(customer);

        assertEquals(expected, result);
    }

    @Test
    void createWrong(){
        Customer customer = new Customer("Carlos", true);
        String expected = "carlos";

        String result = formatter.create(customer);

        assertNotEquals(expected, result);
    }
}
