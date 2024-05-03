package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.service_classes;


import io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes.Card;

import java.util.ArrayList;
import java.util.List;

/*
* The class CardSequence represents the sequence of cards that have been placed on the stack in the middle in a game of UNO.
* It contains a private property that stores a list of cards.
* The first element of that list represents the first card that has been placed (i.e. the card at the very bottom of the stack),
* the last element in the list represents the most recent card that has been placed (i.e. the card at the very top of the stack).
*
*
* It contains a helper method isValid that returns a boolean whether the sequence of cards as a whole is valid (based on the rules specified above).
* For example, for the sequence [RED 4, BLUE 4, BLUE 8, GREEN 8] this method would return true,
* because each card matches the previous card in number or colour.
* The card sequence [RED 4, BLUE 4, GREEN 6] wouldn't be valid,
* because GREEN 6 doesn't match BLUE 4 in colour or number and thus cannot be placed on top of BLUE 4.
* You don't need to use streams to implement this method.
*
*
* It contains a helper method countCardOccurrences
* that takes a card as an argument and counts how often that card appears in the sequence.

* */
public class CardSequence {
    private List<Card> cardSequence = new ArrayList<>();

    public CardSequence(List<Card> cardSequence) {
        this.cardSequence = cardSequence;
    }

    public boolean isValid(){

        for (int i = 0; i < cardSequence.size()-1; i++) {
            if (!cardSequence.get(i).canPlaceOn(cardSequence.get(i+1))){
                return false;
            }
        }

        return true;
    }

    public int countCardOccurrences(Card card){
        return (int) cardSequence
                .stream()
                .filter(c-> (c.getColor().equals(card.getColor()) && c.getNumber() == card.getNumber()))
                .count();
    }
}
