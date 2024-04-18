package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level1.service_classes;

import io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level1.data_classes.RPS_Options;

import java.util.ArrayList;
import java.util.List;

public class RPSAdmin {
    public static List<String> getStyles(List<String> fileLines){
        List<String> outputLines = new ArrayList<>();
        // we need to skip the first line with the number
        for (int i = 1; i < fileLines.size(); i++) {
            outputLines.add(getLineStyle(fileLines.get(i)));
        }
        return outputLines;
    }

    public static String getLineStyle(String line){
        char[] chars = line.toCharArray();
        String left = String.valueOf(chars[0]);
        String right = String.valueOf(chars[1]);

       if (left.equals(right)){
           return left;
       } else if (left.equals("S") && right.equals("P")||
               left.equals("P") && right.equals("R") ||
               left.equals("R") && right.equals("S")) {
           return left;
       } else return right;
    }
}
