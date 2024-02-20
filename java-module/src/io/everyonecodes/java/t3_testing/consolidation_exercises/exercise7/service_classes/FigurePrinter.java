package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise7.service_classes;

public class FigurePrinter {
    public static String printFigure(int maxStars){
        StringBuilder outputText = new StringBuilder();

        if (maxStars < 1){
            maxStars = 1;
        }

        for (int i = 1; i <= maxStars; i++){
            outputText.append("*".repeat(i));
            outputText.append("\n");
        }

        for (int i=maxStars-1; i > 0; i--){
            outputText.append("*".repeat(i));
            outputText.append("\n");
        }

        return String.valueOf(outputText);
    }
}
