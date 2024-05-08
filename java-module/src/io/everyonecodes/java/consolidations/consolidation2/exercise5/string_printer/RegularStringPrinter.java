package io.everyonecodes.java.consolidations.consolidation2.exercise5.string_printer;

import io.everyonecodes.java.consolidations.consolidation2.exercise5.representation.Representation;

import java.util.List;

public class RegularStringPrinter implements StringPrinter{

    @Override
    public void print(List<String> stringList, Representation representation) {
        StringBuilder toPrint = new StringBuilder();

        for (String string: stringList) {
            for (Character character: string.toCharArray()) {
                toPrint.append(representation.convert(character));
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == stringList.size()-1){
                        toPrint.append(" ");
                    }
                }
            }
            toPrint.append("\n");
        }
        System.out.println(toPrint);
    }
}
