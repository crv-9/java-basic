package io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.data_classes.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerUpgraderTest {
    CustomerUpgrader upgrader = new CustomerUpgrader();


    @Test
    void upgradeNormal(){
        Customer newCustomer = new Customer("newCustomer");

        boolean expected = true;
        upgrader.upgrade(newCustomer);
        boolean result = newCustomer.isFirstClass();

        assertEquals(expected,result);
    }

    @Test
    void upgradeAlreadyUpgraded(){
        Customer newCustomer = new Customer("upgradedCustomer", true);

        boolean expected = true;
        upgrader.upgrade(newCustomer);
        boolean result = newCustomer.isFirstClass();

        assertEquals(expected,result);
    }

}
