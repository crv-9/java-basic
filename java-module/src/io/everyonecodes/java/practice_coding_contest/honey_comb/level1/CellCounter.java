package io.everyonecodes.java.practice_coding_contest.honey_comb.level1;

import java.util.ArrayList;
import java.util.List;

public class CellCounter {
    public static List<String> countCells(List<String> fileLines){
        List<String> outputStringList = new ArrayList<>();

        outputStringList.add(String.valueOf(countOs(fileLines)));

        return outputStringList;
    }

    public static int countOs(List<String> fileLines){
        int cellCount = 0;
        for (String line: fileLines) {
            cellCount += (int)line.chars().filter(ch -> ch == 'O').count();
        }
        return cellCount;
    }
}
