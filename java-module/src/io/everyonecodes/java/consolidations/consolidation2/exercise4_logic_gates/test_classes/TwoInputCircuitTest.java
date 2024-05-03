package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.test_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.False;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.True;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.AndGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.NandGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.NorGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.OrGate;
import org.junit.jupiter.api.Test;

public class TwoInputCircuitTest {
    @Test
    void testOneInputCircuit(){
        True trueConstant = new True();
        False falseConstant = new False();

        True secondTrueConstant = new True();
        False secondFalseConstant = new False();

        System.out.println("====== AND =====");

        AndGate andGateTT = new AndGate(trueConstant, secondTrueConstant);
        AndGate andGateTF = new AndGate(trueConstant, falseConstant);
        AndGate andGateFF = new AndGate(falseConstant, secondFalseConstant);

        System.out.println(andGateTT.evaluate());
        System.out.println(andGateTT.circuitRepresentation());

        System.out.println(andGateTF.evaluate());
        System.out.println(andGateTF.circuitRepresentation());

        System.out.println(andGateFF.evaluate());
        System.out.println(andGateFF.circuitRepresentation());

        System.out.println("====== NAND =====");

        NandGate nandGateTT = new NandGate(trueConstant, secondTrueConstant);
        NandGate nandGateTF = new NandGate(trueConstant, falseConstant);
        NandGate nandGateFF = new NandGate(falseConstant, secondFalseConstant);

        System.out.println(nandGateTT.evaluate());
        System.out.println(nandGateTT.circuitRepresentation());

        System.out.println(nandGateTF.evaluate());
        System.out.println(nandGateTF.circuitRepresentation());

        System.out.println(nandGateFF.evaluate());
        System.out.println(nandGateFF.circuitRepresentation());



        System.out.println("====== OR =====");

        OrGate orGateTT = new OrGate(trueConstant, secondTrueConstant);
        OrGate orGateTF = new OrGate(trueConstant, falseConstant);
        OrGate orGateFF = new OrGate(falseConstant, secondFalseConstant);

        System.out.println(orGateTT.evaluate());
        System.out.println(orGateTT.circuitRepresentation());

        System.out.println(orGateTT.evaluate());
        System.out.println(orGateTF.circuitRepresentation());

        System.out.println(orGateFF.evaluate());
        System.out.println(orGateFF.circuitRepresentation());

        System.out.println("====== NOR =====");

        NorGate norGateTT = new NorGate(trueConstant, secondTrueConstant);
        NorGate norGateTF = new NorGate(trueConstant, falseConstant);
        NorGate norGateFF = new NorGate(falseConstant, secondFalseConstant);

        System.out.println(norGateTT.evaluate());
        System.out.println(norGateTT.circuitRepresentation());

        System.out.println(norGateTT.evaluate());
        System.out.println(norGateTF.circuitRepresentation());

        System.out.println(norGateFF.evaluate());
        System.out.println(norGateFF.circuitRepresentation());
    }
}
