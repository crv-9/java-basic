package io.everyonecodes.java.practice_coding_contest.honey_comb.level2;

import java.util.ArrayList;
import java.util.List;

public class FreeCellsCounter {

    static SingleCombChecker singleCombChecker = new SingleCombChecker();
    public static List<String> countFreeCells(List<String> fileLines){
        List<String> outputStringList = new ArrayList<>();


        int amountOfHoneyCombs = getAmountOfCombs(fileLines);

        List<List<String>> allHoneyCombs = getHoneyCombs(fileLines);

        for (int i = 1; i < allHoneyCombs.size(); i++) {

            outputStringList.add(singleCombChecker.countCombFreeCells(allHoneyCombs.get(i)));
        }

        return outputStringList;
    }

    private static int getAmountOfCombs(List<String> fileLines){
        return Integer.parseInt(fileLines.getFirst());
    }

    // I need to go through all the file lines and create a list of honeyCombs
    private static List<List<String >> getHoneyCombs(List<String> fileLines){
        List<List<String>> combs = new ArrayList<>();
        List<String > currentComb = new ArrayList<>();
        // here I am going through every line and checking where are the empty spaces to create different sections
        for (String line : fileLines){
            if (line.trim().isEmpty()){
                // empty line means a section has finished

                if (!currentComb.isEmpty()){
                    combs.add(new ArrayList<>(currentComb));
                    currentComb.clear();
                }
            } else {
                // this adds the current line to the currentComb
                currentComb.add(line);
            }
        }

        // add the last section if not empty

        if (!currentComb.isEmpty()){
            combs.add(new ArrayList<>(currentComb));
        }

        return combs;

    }




}
