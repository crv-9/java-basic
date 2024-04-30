package io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3.service_classes.CardSequence;

import java.util.List;

public interface CardSequenceAnalyser {
    String analyse(List<CardSequence> cardSequenceList);
    String analyserDescription();
}
