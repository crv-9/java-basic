package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.one_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.CircuitElement;

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
