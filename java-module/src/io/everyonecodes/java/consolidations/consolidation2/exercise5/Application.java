package io.everyonecodes.java.consolidations.consolidation2.exercise5;

import io.everyonecodes.java.consolidations.consolidation2.exercise5.representation.BinaryRepresentation;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.representation.DecimalRepresentation;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.representation.HexadecimalRepresentation;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.representation.Representation;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer.AnnotatedStringPrinter;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer.RegularStringPrinter;
import io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer.StringPrinter;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        DecimalRepresentation decimalRepresentation = new DecimalRepresentation();
        HexadecimalRepresentation hexadecimalRepresentation = new HexadecimalRepresentation();
        BinaryRepresentation binaryRepresentation = new BinaryRepresentation();

        RegularStringPrinter regularStringPrinter = new RegularStringPrinter();
        AnnotatedStringPrinter annotatedStringPrinter = new AnnotatedStringPrinter();

        List<String> strings = List.of("A", "AB", "12 45", "a word");
        List<StringPrinter> stringPrinters = List.of(regularStringPrinter, annotatedStringPrinter);
        List<Representation> representations = List.of(binaryRepresentation, decimalRepresentation, hexadecimalRepresentation);

        for (StringPrinter printer : stringPrinters) {
            System.out.println("\n");
            for (Representation representation : representations) {
                printer.print(strings,representation);
            }
        }

        System.out.println("============");

        for (Representation representation: representations) {
            System.out.println("\n");
            for (StringPrinter printer: stringPrinters) {
                printer.print(strings,representation);
            }
        }

    }
}
