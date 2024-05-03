package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.Card;
import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.CardSequenceAnalyser;
import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.Color;

import java.util.List;

public class HighestNumberOfRed2CardsAnalyser implements CardSequenceAnalyser {


    @Override
    public String analyse(List<CardSequence> cardSequenceList) {
        int currentHighestAmount = 0;
        Card cardR2 = new Card(2, Color.RED);

        if (cardSequenceList.isEmpty()){
            return "Result not found. Empty list.";
        }

        for (CardSequence singleSequence: cardSequenceList) {

            int currentCount = singleSequence.countCardOccurrences(cardR2);

            if ( currentCount > currentHighestAmount){
                currentHighestAmount = currentCount;
            }
        }

        if (currentHighestAmount == 0) {return "Result not found.";}
        else return "RED(2) appears at most " + currentHighestAmount + " time(s) in a single sequence.";
    }

    @Override
    public String analyserDescription() {
        return "MOST OCCURRENCES OF RED(2) CARD IN ONE SEQUENCE";
    }
}
