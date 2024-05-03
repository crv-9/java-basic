package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.CircuitElement;

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
