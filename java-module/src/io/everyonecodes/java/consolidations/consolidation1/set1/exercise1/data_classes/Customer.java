package io.everyonecodes.java.consolidations.consolidation1.set1.exercise1.data_classes;

import java.util.Objects;

public class Customer {
    String name;
    boolean isFirstClass;

    public Customer(String name) {
        this.name = name;
        this.isFirstClass = false;
    }

    public Customer(String name, boolean isFirstClass) {
        this.name = name;
        this.isFirstClass = isFirstClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return isFirstClass == customer.isFirstClass && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isFirstClass);
    }
}
