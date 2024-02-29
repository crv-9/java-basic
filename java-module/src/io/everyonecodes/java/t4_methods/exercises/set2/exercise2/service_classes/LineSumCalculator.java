package io.everyonecodes.java.t4_methods.exercises.set2.exercise2.service_classes;


public class LineSumCalculator {
    public static int calculateSum(String inputList){
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

        int sum = 0;
        for (int number: stringAsIntegerListParser.parse(inputList)) {
            sum+= number;
        }
        return sum;
    }
}
