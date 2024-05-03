package io.everyonecodes.java.consolidations.consolidation2.exercise4.two_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.CircuitElement;

public abstract class TwoInputCircuit implements CircuitElement {

    CircuitElement inputACircuitElement;
    CircuitElement inputBCircuitElement;

    public TwoInputCircuit(CircuitElement inputACircuitElement, CircuitElement inputBCircuitElement) {
        this.inputACircuitElement = inputACircuitElement;
        this.inputBCircuitElement = inputBCircuitElement;
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
