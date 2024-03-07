package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise2.service_classes;

import java.util.List;
import java.util.Optional;

public class BeforeDashExtractor {
    public static Optional<String> extract(String input){
        List<String> variable = List.of(input.split("-"));

        if (variable.size()>1){
            return Optional.of(variable.getFirst());
        }
        return Optional.empty();
    }
}
