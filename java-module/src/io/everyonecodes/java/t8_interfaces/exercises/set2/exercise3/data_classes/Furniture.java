package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.data_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Furniture {
    String name;
    List<String> parts;


    public Furniture(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(name, furniture.name) && Objects.equals(parts, furniture.parts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parts);
    }
}
