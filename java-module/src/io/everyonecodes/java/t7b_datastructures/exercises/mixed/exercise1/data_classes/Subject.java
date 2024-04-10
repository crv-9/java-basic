package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes;

public enum Subject {
    MATHS("maths"),
    ENGLISH("english"),
    GERMAN("german"),
    PSYCHOLOGY("psychology"),
    GEOGRAPHY("geography"),
    HISTORY("history");

    private String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}
