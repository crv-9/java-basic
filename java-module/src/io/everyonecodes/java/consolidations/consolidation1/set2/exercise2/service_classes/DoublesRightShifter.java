package io.everyonecodes.java.consolidations.consolidation1.set2.exercise2.service_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublesRightShifter {
    public static List<Double> shiftTwo(List<Double> doublesList){
        List<Double> listCopy = new ArrayList<>(doublesList);

        Collections.rotate(listCopy,2);

        return listCopy;
    }
}
