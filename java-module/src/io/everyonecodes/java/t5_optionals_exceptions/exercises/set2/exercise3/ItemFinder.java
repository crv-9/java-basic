package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise3;

import java.util.List;
import java.util.Optional;

public class ItemFinder {
    public static Optional<String> getItem (List<String>inputList, int position){

        if (position >= inputList.size()){
            return Optional.empty();
        } else {
           return Optional.of(inputList.get(position));
        }
    }

    public static Optional<String> getItem2 (List<String>inputList, int position){

        try {
            return Optional.of(inputList.get(position));
        } catch (IndexOutOfBoundsException e){
            return Optional.empty();
        }
    }

}
