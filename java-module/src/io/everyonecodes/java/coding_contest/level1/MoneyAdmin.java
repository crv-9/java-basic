package io.everyonecodes.java.coding_contest.level1;

import java.util.ArrayList;
import java.util.List;

public class MoneyAdmin {
    public static List<String> getAmountOfCoins(List<String> fileLines){

        // here i am skipping the first two lines of the file
        // And I will send it to be evaluated

        List<String> answerList = new ArrayList<>();

        for (int i = 2; i < fileLines.size(); i++) {
            answerList.add(calculateTheAmountOfCoins(fileLines.get(i)));
        }
        return answerList;
    }


    // find the smalled number that doesn't exist in the
    public static String calculateTheAmountOfCoins(String line){
        char[] numbers = line.toCharArray();

        List<Integer> numbersList = new ArrayList<>();
        int smallestCoin = 0;


        List<String> stringList = List.of(line.split("\\s+"));

        for (String vale: stringList) {
            numbersList.add(Integer.parseInt(vale));
        }




//        for (Character ch: numbers) {
//            numbersList.add(Integer.parseInt(ch.toString()));
//        }


        for (int i = 0; i < numbersList.size(); i++) {

            if ((numbersList.get(i) == i+1)){
                smallestCoin = i+2;
            }
        }

        return String.valueOf(smallestCoin);
    }
}
