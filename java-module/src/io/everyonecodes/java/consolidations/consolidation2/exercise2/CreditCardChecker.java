package io.everyonecodes.java.consolidations.consolidation2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class CreditCardChecker {
    public static String evaluate(String ccNumber){

        if (checkLuhnCompliance(ccNumber) && !checkCCTypeAndFormat(ccNumber).equals("NOT SUPPORTED")){
            return checkCCTypeAndFormat(ccNumber);
        } else if (!checkLuhnCompliance(ccNumber)) {
            return "INVALID";
        } else return "what? try again";

    }

    public static String checkCCTypeAndFormat(String ccNumber){
        // amex
        if (ccNumber.length() == 15 && ccNumber.startsWith(String.valueOf(3))){
            return "AMERICAN EXPRESS";
        }
        // mastercard
        else if (ccNumber.length() == 16 &&ccNumber.startsWith(String.valueOf(5))) {
            return "MASTERCARD";
        }
        // visa
        else if ((ccNumber.length() == 13 || ccNumber.length() == 16 ) && ccNumber.startsWith(String.valueOf(4))) {
            return  "VISA";
        } else return "NOT SUPPORTED";
    }

    public static boolean checkLuhnCompliance(String ccNumber){
        List<Integer> digitsToBeMultiplied = new ArrayList<>();
        List<Integer> multipliedDigits = new ArrayList<>();
        List<Integer> digitsToAdd = new ArrayList<>();

        int digitSum = 0;
        // here i take every second digit left to right that will be multiplied by 2
        for (int i = ccNumber.length()-2; i >= 0; i-=2) {
            digitsToBeMultiplied.add(Integer.parseInt(String.valueOf(ccNumber.charAt(i))));
        }
        // here I take the numbers that will not be multiplied for the sum
        for (int i = ccNumber.length()-1; i >= 0; i-=2) {
            digitsToAdd.add(Integer.parseInt(String.valueOf(ccNumber.charAt(i))));
        }
        // here i multiply the numbers from the list
        for (Integer digit: digitsToBeMultiplied) {
            multipliedDigits.add(digit * 2);
        }
        // here i make sure i get every single digit of the numbers that were multiplied
        for (Integer digit: multipliedDigits) {
            if (digit<10 && digit >=0){
                digitsToAdd.add(digit);
            } else if (digit > 9 && digit < 20) {
                digitsToAdd.add(1);
                digitsToAdd.add(digit-10);
            }
        }

        // here I add all digits
        for (Integer digit: digitsToAdd) {
            digitSum += digit;
        }

        return digitSum % 10 == 0;

    }
}
