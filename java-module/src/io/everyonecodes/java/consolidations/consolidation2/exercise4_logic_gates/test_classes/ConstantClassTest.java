package io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.test_classes;

import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.False;
import io.everyonecodes.java.consolidations.consolidation2.exercise4_logic_gates.constant_classes.True;
import org.junit.jupiter.api.Test;

public class ConstantClassTest {
    @Test
    void testConstant(){
        True trueConstant = new True();

        System.out.println(trueConstant.evaluate());
        System.out.println(trueConstant.circuitRepresentation());

        False falseConstant = new False();
        System.out.println(falseConstant.evaluate());
        System.out.println(falseConstant.circuitRepresentation());

    }
}
