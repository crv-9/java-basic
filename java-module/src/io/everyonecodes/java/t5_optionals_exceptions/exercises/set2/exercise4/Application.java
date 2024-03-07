package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> mutableList = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> immutableList = List.of(1,2,3);
        getUpdatedList(mutableList);
        System.out.println(mutableList);

        getUpdatedList(immutableList);
        System.out.println(immutableList);
    }

    public static void getUpdatedList(List<Integer> inputList){
        int maxSize = inputList.size()*2;
        for (int i = 0; i < maxSize;) {
            try {
                inputList.add(i + 1, inputList.get(i));
            } catch (UnsupportedOperationException uoe){
                System.out.println("doing nothing");
                break;
            }
            i += 2;
        }
    }
}

        /*The disadvantage of simply ignoring this exception is that we might keep on using the list in consecutive code,
        and we would use it with wrong data, we would be expecting a modified list, and we would get the original.

        We could improve it by having a warning for the cases in which the list is immutable.
        * */