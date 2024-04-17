package io.everyonecodes.java.practice_coding_contest.honey_comb.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreeCellsCounter {
    public static List<String> countFreeCells(List<String> fileLines){
        List<String> outputStringList = new ArrayList<>();



        return outputStringList;
    }


    // i need to give back the index of the line the wasp is in.
    public static void locateTheWasp(List<String> fileLines){
        int lineWasp = 0;
        for (int i = 0; i < fileLines.size(); i++) {
            if( Arrays.stream(fileLines.get(i).split("-")).toList().contains("W")){
                lineWasp = i;
            };
        }
    }

    // i need to figure out the column or position in the row where W is --> colPos
    // then we need to count if there are free spaces ( O ) in the previous row at position colPos-1 && colPos+1

}
