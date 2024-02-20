package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise3.service_classes;

public class PyramidMaker {
    public static String makePyramid(int base){
        StringBuilder outputText = new StringBuilder();

        for (int i = 1; i <= base; i++) {
            // Here I print spaces before the numbers
            for (int j = 1; j <= base - i; j++) {
                outputText.append(" ");
            }

            for(int numbers = 1; numbers < i + 1; numbers++){
                outputText.append(numbers);
            }
            // Move to the next line after each round
            outputText.append("\n");
        }
        return String.valueOf(outputText);

    }
}
