package io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.data_classes.Customer;

public class CustomerUpgrader {
    public void upgrade(Customer customer){
        if (customer.isFirstClass()){
            // do nothing
        } else {
            customer.setFirstClass(true);
        }
    }
}
