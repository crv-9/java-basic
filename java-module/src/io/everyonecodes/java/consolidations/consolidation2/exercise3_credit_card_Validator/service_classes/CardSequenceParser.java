package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.Card;

import java.util.ArrayList;
import java.util.List;

/*The class CardSequenceParser with the parse method.
It takes the string representation of a card sequence as input
 and returns an instance of CardSequence that corresponds to the string representation.
 The string representation of a card sequence consists of the string representation of its constituent cards separated by a semicolon.
 For example, the string representation "r,7;b,8;g,4" represents the card sequence
 [RED 7, BLUE 8, GREEN 4], in that order.
 You can once again assume that the string passed to this method is always in the correct format
 (but keep in mind that the empty string is also a valid card sequence, namely the sequence of cards with 0 cards).
 Make sure to use the CardParser class internally to parse the individual cards in that sequence.
* */
public class CardSequenceParser {
    CardParser cardParser = new CardParser();
    public CardSequence parse(String line){
        String[] stringSequence = line.split(";");
        List<Card> cardList = new ArrayList<>();

        for (String cardString: stringSequence) {
            cardList.add(cardParser.parse(cardString));
        }

        return new CardSequence(cardList);
    }
}
