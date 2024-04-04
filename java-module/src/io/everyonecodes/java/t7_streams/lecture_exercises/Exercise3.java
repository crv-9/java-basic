package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.function.DoubleToIntFunction;

public class Exercise3 {
    public static void main(String[] args) {

        double myDouble = 4.9;

        callMyLambda(myDouble, (num) -> (int) num);

    }

    public static void callMyLambda(double num, DoubleToIntFunction lambdaString){
        System.out.println(lambdaString.applyAsInt(num));
    }

}
