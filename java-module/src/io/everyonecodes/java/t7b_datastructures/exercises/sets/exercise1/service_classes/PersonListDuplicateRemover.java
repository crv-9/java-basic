package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.data_classes.Person;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonListDuplicateRemover {
    public static List<Person> remove(List<Person> personList){
        Set<Person> personSet = new HashSet<>(personList);
        return personSet.stream().toList();
    }
}
