package io.everyonecodes.java.consolidations.consolidation2.exercise3.service_classes;


import io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes.Card;
import io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes.Color;

/*The class CardParser with the parse method.
It takes the string representation of a card as input
and returns an instance of Card that corresponds to that string representation.
Every string representation of a card follows the format "color,number", where color is one of "y", "g", "r", "b",
which respectively stand for yellow, green, red, blue, and number is a number between 1-9.
You can assume that this method will always get a string in the correct format,
i.e. you don't need to do any additional validation. For example, the string "r,7" would correspond to a RED 7 card.*/
public class CardParser {
    public static Card parse(String cardString){
        String[] splitString = cardString.split(",");

        Color color = null;

        switch (splitString[0]){
            case "r" -> color = Color.RED;
            case "g" -> color = Color.GREEN;
            case "y" -> color = Color.YELLOW;
            case "b" -> color = Color.BLUE;
        }

        return new Card(Integer.parseInt(splitString[1]),color);
    }
}
