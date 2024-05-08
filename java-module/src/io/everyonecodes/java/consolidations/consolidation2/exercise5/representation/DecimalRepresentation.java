package io.everyonecodes.java.consolidations.consolidation2.exercise5.representation;

public class DecimalRepresentation implements Representation{


    @Override
    public String convert(Character character) {
        return String.valueOf((int)character);
    }
}
