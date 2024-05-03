package io.everyonecodes.java.consolidations.consolidation2.exercise4.two_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.CircuitElement;

public class XorGate extends TwoInputCircuit{

    boolean inputA;
    boolean inputB;
    String inputARep;
    String inputBRep;

    public XorGate(CircuitElement inputACircuitElement, CircuitElement inputBCircuitElement) {
        super(inputACircuitElement, inputBCircuitElement);
        this.inputA = inputACircuitElement.evaluate();
        this.inputB = inputBCircuitElement.evaluate();

        this.inputARep = inputACircuitElement.circuitRepresentation();
        this.inputBRep = inputBCircuitElement.circuitRepresentation();

    }

    @Override
    public boolean evaluate() {
        super.evaluate();
        return !(inputA == inputB);
    }

    @Override
    public String circuitRepresentation() {
        return "XOR("+inputARep+","+inputBRep+")";
    }
}
