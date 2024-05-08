package io.everyonecodes.java.consolidations.consolidation2.exercise5.representation;

public class BinaryRepresentation implements Representation{


    @Override
    public String convert(Character character) {
        return "0b" + Integer.toBinaryString((int)character);
    }
}
