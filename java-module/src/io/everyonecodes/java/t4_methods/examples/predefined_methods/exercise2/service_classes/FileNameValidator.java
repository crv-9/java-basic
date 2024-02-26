package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;

public class FileNameValidator {
    public static boolean hasProperName(String fileName){
        return  (fileName.startsWith("PHOTO_") && fileName.endsWith(".png"));
    }
}
