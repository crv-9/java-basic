package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes.CardSequence;

import java.util.List;

public interface CardSequenceAnalyser {
    String analyse(List<CardSequence> cardSequenceList);
    String analyserDescription();
}
