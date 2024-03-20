package io.everyonecodes.java.consolidations.consolidation1.set1.exercise2.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.data_classes.Customer;

public class ScreenNameFormatter {
    public static String create(Customer customer){

        if (customer.isFirstClass()){
            return customer.getName().toUpperCase();
        } else {
            return customer.getName().toLowerCase();
        }
    }
}
