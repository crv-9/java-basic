package io.everyonecodes.java.consolidations.consolidation2.exercise4.constant_classes;

public class False extends Constant{


    @Override
    public boolean evaluate() {
        return false;
    }

    @Override
    public String circuitRepresentation() {
        return "FALSE";
    }
}
