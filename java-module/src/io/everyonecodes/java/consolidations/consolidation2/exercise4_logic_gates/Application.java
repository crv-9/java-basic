package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.False;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.True;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.one_input_classes.NotGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.AndGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.NandGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.NorGate;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.two_input_classes.XorGate;

public class Application {


    public static void main(String[] args) {

        True trueElement = new True();
        False falseElement = new False();

        firstCircuit(trueElement, falseElement, falseElement);
        secondCircuit(trueElement, trueElement, trueElement, trueElement);
        thirdCircuit(trueElement, falseElement);
    }

    private static void firstCircuit(CircuitElement firstElement, CircuitElement secondElement, CircuitElement thirdElement) {
        CircuitElement firstCheckA = new NandGate(firstElement, secondElement);
        CircuitElement firstCheckB = new NotGate(thirdElement);

        CircuitElement secondCheck = new NorGate(firstCheckA, firstCheckB);

        printResult(secondCheck);

        // this would be the shortest but not so easy to read
        // printResult(new NorGate(new NandGate(firstElement, secondElement), new NotGate(thirdElement)));

    }

    private static void secondCircuit(CircuitElement firstElement, CircuitElement secondElement, CircuitElement thirdElement, CircuitElement fourthElement) {
        CircuitElement firstCheckA = new AndGate(firstElement, secondElement);
        CircuitElement firstCheckB = new AndGate(thirdElement, fourthElement);

        CircuitElement secondCheck = new AndGate(firstCheckA, firstCheckB);

        printResult(secondCheck);

        // this would be the shortest but not so easy to read
        // printResult(new AndGate(new AndGate(firstElement, secondElement), new AndGate(thirdElement, fourthElement)));

    }

    private static void thirdCircuit(CircuitElement firstElement, CircuitElement secondElement) {
        CircuitElement firstCheckA = new NandGate(firstElement, secondElement);
        CircuitElement firstCheckB = new NotGate(secondElement);

        CircuitElement secondCheckB = new AndGate(firstCheckB, firstCheckB);

        CircuitElement lastCheck = new XorGate(firstCheckA, secondCheckB);

        printResult(lastCheck);

        // this would be the shortest but not so easy to read
        // printResult(new XorGate(new NandGate(firstElement, secondElement), new AndGate(new NotGate(secondElement), new NotGate(secondElement))));
    }

    private static void printResult(CircuitElement element) {
        System.out.println("Evaluates to: " + element.evaluate());
        System.out.println("Representation: " + element.circuitRepresentation());
    }

}
