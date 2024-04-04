package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.function.DoubleToIntFunction;

public class Exercise2 {
    public static void main(String[] args) {
        DoubleToIntFunction roundDownToInt = (num) -> (int) num;

        double myDouble = 4.9;
        int result = roundDownToInt.applyAsInt(myDouble);
        System.out.println(result);
    }
}
