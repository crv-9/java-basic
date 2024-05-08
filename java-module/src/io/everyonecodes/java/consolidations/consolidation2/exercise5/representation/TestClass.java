package io.everyonecodes.java.consolidations.consolidation2.exercise5.representation;

import io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer.AnnotatedStringPrinter;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer.RegularStringPrinter;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestClass {
    DecimalRepresentation decimalRepresentation = new DecimalRepresentation();
    HexadecimalRepresentation hexadecimalRepresentation = new HexadecimalRepresentation();
    BinaryRepresentation binaryRepresentation = new BinaryRepresentation();
    RegularStringPrinter regularStringPrinter = new RegularStringPrinter();
    AnnotatedStringPrinter annotatedStringPrinter = new AnnotatedStringPrinter();

    @Test
    void decimal(){
        System.out.println(decimalRepresentation.convert('a'));
        System.out.println(hexadecimalRepresentation.convert('a'));
        System.out.println(binaryRepresentation.convert('a'));
    }

    @Test
    void regularPrinter(){
        regularStringPrinter.print(List.of("ABC!"), decimalRepresentation);
        regularStringPrinter.print(List.of("ABC!"), hexadecimalRepresentation);
        regularStringPrinter.print(List.of("ABC!"), binaryRepresentation);
    }

    @Test
    void annotatedPrinter(){
        annotatedStringPrinter.print(List.of("ABC!"), decimalRepresentation);
        annotatedStringPrinter.print(List.of("ABC!"), hexadecimalRepresentation);
        annotatedStringPrinter.print(List.of("ABC!"), binaryRepresentation);
    }
}
