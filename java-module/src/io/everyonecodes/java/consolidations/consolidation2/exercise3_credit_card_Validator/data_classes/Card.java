package io.everyonecodes.java.consolidations.consolidation2.exercise3_credit_card_Validator.data_classes;


/*The class Card, which represents a UNO card.
It contains the properties number (int) and color (Color).
It also contains the method canPlaceOn that takes another card as a parameter
 and returns a boolean depending on whether the current card can be placed on top of the card passed as the argument
 (based on the rules described above).*/
public class Card {

    int number;
    Color color;

    public Card(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean canPlaceOn(Card previousCard){
        return previousCard.color.equals(this.color) || previousCard.number == this.number;
    }

}
