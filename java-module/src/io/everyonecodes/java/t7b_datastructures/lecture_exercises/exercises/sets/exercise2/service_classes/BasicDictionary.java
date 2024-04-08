package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exercises.sets.exercise2.service_classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicDictionary {
    private Set<String> knownWords;

    public List<String> findUnknownWords(String inputSentence){

        knownWords = new HashSet<>(
                java.util.Set.of(
                        "hi", "house",
                        "dog", "cat", "elephant",
                        "table", "chair"
                )
        );

        List<String> unknownWordsList = new ArrayList<>();

        // converting split array,toList,toSet
        Set<String> sentenceStringSet = new HashSet<>(List.of(inputSentence.toLowerCase().split("\\s+",0)));

        for (String word: sentenceStringSet) {
            if (!knownWords.contains(word)){
                unknownWordsList.add(word);
            }
        }

        return unknownWordsList;
    }
}
