package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1.service_classes;

import java.util.List;

public class NumberSorter {
    public static int returnGreatestNumber(List<Integer> numbers){
        for(int currentItemIndex = 1; currentItemIndex < numbers.size(); currentItemIndex++){
            int valueCurrentItem = numbers.get(currentItemIndex);
            int previousItemIndex = currentItemIndex - 1;
            while (previousItemIndex >= 0 && numbers.get(previousItemIndex) > valueCurrentItem){
                numbers.set(previousItemIndex + 1, numbers.get(previousItemIndex));
                previousItemIndex--;
            }
            numbers.set(previousItemIndex + 1, valueCurrentItem);
        }
        return numbers.getLast();

    }
}
