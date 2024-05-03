package io.everyonecodes.java.consolidations.consolidation2.exercise4.one_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.CircuitElement;

public class NotGate extends OneInputCircuit{

    boolean tempInput;
    String tempRepresentation;
    public NotGate(CircuitElement circuitElementInput) {
        super(circuitElementInput);
        this.tempInput = circuitElementInput.evaluate();
        this.tempRepresentation = circuitElementInput.circuitRepresentation();
    }

    @Override
    public boolean evaluate() {
        super.evaluate();
        return !tempInput;
    }

    @Override
    public String circuitRepresentation() {
        return "NOT(" + tempRepresentation + ")";
    }
}
