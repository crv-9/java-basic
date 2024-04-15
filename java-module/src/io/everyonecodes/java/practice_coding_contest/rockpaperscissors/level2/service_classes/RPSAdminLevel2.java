package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level2.service_classes;

import java.util.ArrayList;
import java.util.List;

public class RPSAdminLevel2 {
    public static List<String> getTwoRounds(List<String> fileLines){
        List<String> outputLines = new ArrayList<>();


        // I need to skip the first line as it has the amount of games
        for (int i = 1; i < fileLines.size(); i++) {
            String firstRoundDone = getOneRound(fileLines.get(i));
            outputLines.add(getOneRound(firstRoundDone));
        }
        // below code doesn't work bc first file line has non-tournament data
//        for (String line: fileLines) {
//            String firstRoundDone = getOneRound(line);
//            outputLines.add(getOneRound(firstRoundDone));
//        }

        return outputLines;
    }

    private static String getOneRound(String line){
        // we need to split the line into pairs.
        char[] chars = line.toCharArray();

        List<String> pairsList = new ArrayList<>();

        // here I am making the list into pairs for further game evaluation
        for (int i = 0; i < chars.length; i+=2) {
            String currentPairLeft = String.valueOf(chars[i]);
            String currentPairRight = String.valueOf(chars[i+1]);

            pairsList.add(currentPairLeft+currentPairRight);
        }

        List<String> resultsList = new ArrayList<>();
        for (String pair: pairsList) {
            resultsList.add(getPairStyle(pair));
        }

        StringBuilder resultLine = new StringBuilder();
        for (String result: resultsList) {
            resultLine.append(result);
        }

        return resultLine.toString();
    }


    private static String getPairStyle(String pair){
        char[] chars = pair.toCharArray();
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
