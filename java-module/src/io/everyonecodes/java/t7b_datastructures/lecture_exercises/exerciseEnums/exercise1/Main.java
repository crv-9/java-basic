package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exerciseEnums.exercise1;

public class Main {
    public static void main(String[] args) {

        for (MyMonths month: MyMonths.values()) {
            System.out.println(month);
        }

    }



    public static boolean isSummer(MyMonths months){
        return months == MyMonths.JUNE || months == MyMonths.JULY || months == MyMonths.AUGUST;
    }
}
