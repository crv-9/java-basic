package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.CircuitElement;

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
