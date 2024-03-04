package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise1.service_classes;

import io.everyonecodes.java.t4_methods.exercises.set1.exercise4.data_classes.FilmCharacter;

import java.util.Optional;

public class FilmCharacterParserT5Example {
    public static FilmCharacter parser(String fullName){
        String[] splitName = fullName.split(";",0);
        return new FilmCharacter(splitName[0],splitName[1]);
    }

    public static Optional<FilmCharacter> parser2(String fullName){
        String[] splitName = fullName.split(";");

        if (splitName.length <= 1){
            return Optional.empty();
        }

        if (splitName[0].isEmpty() || splitName[1].isEmpty()){
            return Optional.empty();
        }

        return Optional.of(new FilmCharacter(splitName[0], splitName[1]));
    }
}
