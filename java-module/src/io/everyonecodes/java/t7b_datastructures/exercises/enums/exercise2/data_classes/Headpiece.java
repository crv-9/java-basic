package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes;

public enum Headpiece {
    WARM("beanie"),
    LIGHT("cap");

    private String description;

    Headpiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Headpiece{" +
                "description='" + description + '\'' +
                '}';
    }
}
