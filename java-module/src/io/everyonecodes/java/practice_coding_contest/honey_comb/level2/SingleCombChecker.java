package io.everyonecodes.java.practice_coding_contest.honey_comb.level2;

import java.util.Arrays;
import java.util.List;

public class SingleCombChecker {

    public static String countCombFreeCells(List<String> combLines){

        int emptyCellCounter =0;

        int waspRow = locateTheWaspRow(combLines);
        int waspColumn = locateWaspColumn(combLines.get(waspRow));


        // same level
        emptyCellCounter += locateSameLevelEmptyCells(combLines.get(waspRow), waspColumn);
        // top level
        emptyCellCounter += locateTopAndBelowLevelsEmptyCells(combLines.get(waspRow - 1), waspColumn);
        // below level
        emptyCellCounter += locateTopAndBelowLevelsEmptyCells(combLines.get(waspRow + 1), waspColumn);


        return String.valueOf(emptyCellCounter);
    }

    // i need to give back the index of the line the wasp is in.
    private static int locateTheWaspRow(List<String> combLines){
        int lineWasp = 0;
        for (int i = 0; i < combLines.size(); i++) {
            if( Arrays.stream(combLines.get(i).split("-")).toList().contains("W")){
                lineWasp = i;
            };
        }
        return lineWasp;
    }
    private static int locateWaspColumn(String waspLine){
        char[] chars = waspLine.toCharArray();
        int columnWasp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals("W")){
                columnWasp = i;
            };
        }
        return columnWasp;
    }

    // Locate empty cells in same level

    private static int locateSameLevelEmptyCells(String waspLine, int waspColumnPosition){
        char[] chars = waspLine.toCharArray();
        int cellCounter = 0;

        if (String.valueOf(chars[waspColumnPosition - 2]).equals("O")){
            cellCounter++;
        }
        if (String.valueOf(chars[waspColumnPosition + 2]).equals("O")){
            cellCounter++;
        }

        return cellCounter;
    }

    // locate empty cells above and below
    private static int locateTopAndBelowLevelsEmptyCells(String line, int waspColumnPosition){
        char[] chars = line.toCharArray();
        int cellCounter = 0;

        if (String.valueOf(chars[waspColumnPosition - 1]).equals("O")){
            cellCounter++;
        }
        if (String.valueOf(chars[waspColumnPosition + 1]).equals("O")){
            cellCounter++;
        }

        return cellCounter;

    }
}
