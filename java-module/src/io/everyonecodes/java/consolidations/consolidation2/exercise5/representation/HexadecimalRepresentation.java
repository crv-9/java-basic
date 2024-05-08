package io.everyonecodes.java.consolidations.consolidation2.exercise5.representation;

public class HexadecimalRepresentation implements Representation{


    @Override
    public String convert(Character character) {
        return "0x" + Integer.toHexString((int) character);
    }
}
