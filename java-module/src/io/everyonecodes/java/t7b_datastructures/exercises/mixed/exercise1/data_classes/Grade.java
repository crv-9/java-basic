package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes;

public enum Grade {
    VERY_GOOD(1),
    GOOD(2),
    SATISFACTORY(3),
    ADEQUATE(4),
    UNSATISFACTORY(5);

    private int number;

    Grade(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "number=" + number +
                '}';
    }
}
