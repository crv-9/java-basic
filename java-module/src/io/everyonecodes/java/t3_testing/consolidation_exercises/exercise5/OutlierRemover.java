package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise5;

import java.util.List;

public class OutlierRemover {
    public static List<Integer> removeOutliers(List<Integer> numbers){
        List<Integer> newNumbers = numbers;

        if (numbers.size() < 3){
            return numbers;
        }

        // I need to check for the largest number of the list
        int largestValue = 0;
        for (int i=0; i < newNumbers.size();i++){
            int currentItemValue = newNumbers.get(i);
            if (currentItemValue > largestValue){
                largestValue = currentItemValue;
            }
        }

        // I need to know the smallest value
        int smallestValue = largestValue;
        for (int i=0; i < newNumbers.size();i++){
            int currentItemValue = newNumbers.get(i);
            if (currentItemValue < largestValue && currentItemValue < smallestValue){
                smallestValue = newNumbers.get(i);
            }
        }

        // when I find the small one i remove it,
        // if removed, then I break out of the loop

        for (int i =0; i < newNumbers.size();){
            if (newNumbers.get(i) == smallestValue){
                newNumbers.remove(i);
                break;
            } else {i++;};
        }

        for (int i =0; i < newNumbers.size();){
            if (newNumbers.get(i) == largestValue){
                newNumbers.remove(i);
                break;
            } else {i++;};
        }


        return newNumbers;
    }
}
