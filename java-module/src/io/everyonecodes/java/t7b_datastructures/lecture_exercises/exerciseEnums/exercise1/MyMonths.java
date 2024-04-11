package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exerciseEnums.exercise1;

public enum MyMonths {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int monthNumber;
    MyMonths(int monthNumber) {
        this.monthNumber = monthNumber;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
