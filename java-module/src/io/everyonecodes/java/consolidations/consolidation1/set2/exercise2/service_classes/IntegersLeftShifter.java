package io.everyonecodes.java.consolidations.consolidation1.set2.exercise2.service_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegersLeftShifter {
    public static List<Integer> shiftOne(List<Integer> integerList){
        List<Integer> listCopy = new ArrayList<>(integerList);

        Collections.rotate(listCopy,-1);

        return listCopy;
    }
}
