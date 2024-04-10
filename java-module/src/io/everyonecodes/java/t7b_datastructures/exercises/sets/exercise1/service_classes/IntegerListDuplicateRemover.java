package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.service_classes;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*A method that receives a list of whole numbers and returns the same list but without any duplicates.
See the example below. Use a set internally to simplify the logic.

-- IntegerListDuplicateRemover example:
[1, 2, 3, 4, 4, 2, 1]  ->  [1, 2, 3, 4]

 */
public class IntegerListDuplicateRemover {
    public static List<Integer> remove(List<Integer> integerList){

        Set<Integer> intSet = new HashSet<>(integerList);

        return intSet.stream().toList();
    }

}
