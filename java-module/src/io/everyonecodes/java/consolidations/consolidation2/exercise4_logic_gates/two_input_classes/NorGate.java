package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.CircuitElement;

public class NorGate extends TwoInputCircuit{

    boolean inputA;
    boolean inputB;
    String inputARep;
    String inputBRep;

    public NorGate(CircuitElement inputACircuitElement, CircuitElement inputBCircuitElement) {
        super(inputACircuitElement, inputBCircuitElement);
        this.inputA = inputACircuitElement.evaluate();
        this.inputB = inputBCircuitElement.evaluate();

        this.inputARep = inputACircuitElement.circuitRepresentation();
        this.inputBRep = inputBCircuitElement.circuitRepresentation();

    }

    @Override
    public boolean evaluate() {
        super.evaluate();
        return !(inputA || inputB);
    }

    @Override
    public String circuitRepresentation() {
        return "NOR("+inputARep+","+inputBRep+")";
    }
}
