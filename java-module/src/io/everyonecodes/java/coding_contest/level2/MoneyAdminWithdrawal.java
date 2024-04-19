package io.everyonecodes.java.coding_contest.level2;

import java.util.ArrayList;
import java.util.List;


public class MoneyAdminWithdrawal {
    public static List<String> getWithdrawal(List<String> fileLines){

        // i need to ignore the first 3 file lines
        // after that I need to create two lists, one for the currency the other for what the customer wants
        // I will send both lists to be evaluated in another method

        List<String> fileLinesToWorkWith = new ArrayList<>();
        // here we are cleaning the lines as lists
        for (int i = 3; i < fileLines.size(); i++) {
            fileLinesToWorkWith.add(fileLines.get(i));
        }

        List<List<Integer>> currencyAndCustomerWantLists = new ArrayList<>();
        for (String line: fileLinesToWorkWith) {
            currencyAndCustomerWantLists.add(getStringAsIntList(line));
        }

        List<List<String>> resultList = new ArrayList<>();
        for (int i = 0; i < currencyAndCustomerWantLists.size(); i=+2) {
            resultList.add(calculateCoinsForCustomer(currencyAndCustomerWantLists.get(i), currencyAndCustomerWantLists.get(i+1)));
            break;
        }

        List<String> answersList = new ArrayList<>();
        for (List<String> set: resultList) {
            answersList.addAll(set);
        }


        return answersList;



    }
    // i need to return a clean list of int
    public static List<List<Integer>> getCleanedLines(List<String> fileLinesToWorkWith){

        // here i need to clean the list of currencies into only int

        List<List<Integer>> currencyAndCustomerWantLists= new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        for (int i = 0; i < fileLinesToWorkWith.size(); i=+2) {
            currencyAndCustomerWantLists.add(getStringAsIntList(fileLinesToWorkWith.get(i)));
        }

        System.out.println(currencyAndCustomerWantLists);
        return currencyAndCustomerWantLists;

    }

    public static List<Integer> getStringAsIntList(String line){
        List<Integer> numbersList = new ArrayList<>();
        List<String> stringList= List.of(line.split("\\s+"));
        for (String value: stringList) {
            numbersList.add(Integer.parseInt(value));
        }

        return numbersList;
    }

    public static List<String> calculateCoinsForCustomer(List<Integer> currencyList, List<Integer> customerWantsList) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num : customerWantsList) {
            boolean found = false;
            for (int i = 0; i < currencyList.size(); i++) {
                for (int j = i; j < currencyList.size() && !found; j++) {
                    if (currencyList.get(i) + currencyList.get(j) == num) {
                        result.add(List.of(currencyList.get(i), currencyList.get(j)));
                        found = true;
                    }
                }
            }
        }


        List<String> finalResult = new ArrayList<>();
        for (List<Integer> num : result){

            finalResult.add(num.get(0) + " " + num.get(1));
        }
        return finalResult;
    }



}
