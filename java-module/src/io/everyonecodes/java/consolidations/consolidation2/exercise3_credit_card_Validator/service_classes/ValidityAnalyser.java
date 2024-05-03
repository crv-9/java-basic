package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.CardSequenceAnalyser;

import java.util.List;

public class ValidityAnalyser implements CardSequenceAnalyser {
    @Override
    public String analyse(List<CardSequence> cardSequenceList) {
        int countValid = 0;
        int countNotValid = 0;
        if (cardSequenceList.isEmpty()){return "Result not found. Empty list.";}

        for (CardSequence sequence: cardSequenceList) {
            if (sequence.isValid()){
             countValid++;
            } else countNotValid++;
        }

        return "Invalid sequences: " + countNotValid + "\n" +
                "Valid sequences: " + countValid;
    }

    @Override
    public String analyserDescription() {
        return "VALIDITIES OF THE CARD SEQUENCES";
    }
}
