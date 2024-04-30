package io.everyonecodes.java.consolidations.consolidation2.exercise3.service_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes.Card;
import io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes.CardSequenceAnalyser;
import io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes.Color;

import java.util.List;

public class TotalNumberOfBlue6CardsAnalyser implements CardSequenceAnalyser {


    @Override
    public String analyse(List<CardSequence> cardSequenceList) {
        int totalAppearanceAmount = 0;
        Card cardB6 = new Card(6, Color.BLUE);
        if (cardSequenceList.isEmpty()){
            return "Result not found. Empty list.";
        }

        for (CardSequence singleSequence: cardSequenceList) {
            int currentCount = singleSequence.countCardOccurrences(cardB6);
            if (currentCount > 0) {totalAppearanceAmount += currentCount;}
        }


        return "Blue(6) occurs " + totalAppearanceAmount + " time(s) in total.";
    }

    @Override
    public String analyserDescription() {
        return "TOTAL NUMBER OF OCCURRENCES OF BLUE(6) CARD";
    }
}
