package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsToLengthMapper {
    public static Map<String, Integer> map(List<String> stringList){
        Map<String, Integer> resultMap = new HashMap<>(Map.of());

        for (String string: stringList) {
            resultMap.put(string, string.length());
        }

        return resultMap;
    }
}
