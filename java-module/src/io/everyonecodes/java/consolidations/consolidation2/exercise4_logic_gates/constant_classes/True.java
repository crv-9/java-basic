package io.everyonecodes.java.consolidations.consolidation2.exercise4.constant_classes;

public class True extends Constant{


    @Override
    public boolean evaluate() {
        return true;
    }

    @Override
    public String circuitRepresentation() {
        return "TRUE";
    }
}
