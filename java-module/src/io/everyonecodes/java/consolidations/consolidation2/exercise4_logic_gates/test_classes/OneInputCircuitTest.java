package io.everyonecodes.java.consolidations.consolidation2.exercise4.test_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4.constant_classes.False;
import io.everyonecodes.java.consolidations.consolidation2.exercise4.constant_classes.True;
import io.everyonecodes.java.consolidations.consolidation2.exercise4.one_input_classes.NotGate;
import org.junit.jupiter.api.Test;

public class OneInputCircuitTest {
    @Test
    void testOneInputCircuit(){
        True trueConstant = new True();
        False falseConstant = new False();


        NotGate notGate = new NotGate(trueConstant);
        NotGate notGate2 = new NotGate(falseConstant);

        System.out.println(notGate.evaluate());
        System.out.println(notGate.circuitRepresentation());
        System.out.println(notGate2.evaluate());
        System.out.println(notGate2.circuitRepresentation());




    }
}
