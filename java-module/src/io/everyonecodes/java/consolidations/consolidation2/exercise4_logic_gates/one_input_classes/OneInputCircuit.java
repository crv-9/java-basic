package io.everyonecodes.java.consolidations.consolidation2.exercise4.one_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.CircuitElement;

public abstract class OneInputCircuit implements CircuitElement {

    CircuitElement circuitElementInput;

    public OneInputCircuit(CircuitElement circuitElementInput) {
        this.circuitElementInput = circuitElementInput;
    }

    @Override
    public boolean evaluate() {
        return false;
    }

    @Override
    public String circuitRepresentation() {
        return null;
    }
}
