package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;


import static io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes.FileNameValidator.hasProperName;

public class DateExtractor {
    public static String extractDate(String fileName){
        if (hasProperName(fileName)){
            return fileName.substring(6,fileName.length()-4);
        } return "invalid file name";

    }
}
