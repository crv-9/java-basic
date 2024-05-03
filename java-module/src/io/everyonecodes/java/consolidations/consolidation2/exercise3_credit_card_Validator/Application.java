package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator;

import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ValidityAnalyser validityAnalyser = new ValidityAnalyser();
        HighestNumberOfRed2CardsAnalyser highestNumberOfRed2CardsAnalyser = new HighestNumberOfRed2CardsAnalyser();
        TotalNumberOfBlue6CardsAnalyser totalNumberOfBlue6CardsAnalyser = new TotalNumberOfBlue6CardsAnalyser();
        CardSequenceReader reader = new CardSequenceReader();
        CardSequenceParser parser = new CardSequenceParser();

        List<CardSequence> lines = reader.readLines();

        System.out.println(validityAnalyser.analyserDescription());
        System.out.println(validityAnalyser.analyse(lines));

        System.out.println(highestNumberOfRed2CardsAnalyser.analyserDescription());
        System.out.println(highestNumberOfRed2CardsAnalyser.analyse(lines));

        System.out.println(totalNumberOfBlue6CardsAnalyser.analyserDescription());
        System.out.println(totalNumberOfBlue6CardsAnalyser.analyse(lines));



    }
}
