package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;

import java.util.List;
import java.util.Random;

public class RandomFileNamePicker {
    public static String pickRandomFile(List<String> files){
        Random random = new Random();
        return files.get(random.nextInt(files.size()));
    }
}
