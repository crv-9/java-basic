package io.everyonecodes.java.consolidations.consolidation2.exercise4.constant_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.CircuitElement;

public abstract class Constant implements CircuitElement {

    @Override
    public boolean evaluate() {
        return false;
    }

    @Override
    public String circuitRepresentation() {
        return null;
    }
}
