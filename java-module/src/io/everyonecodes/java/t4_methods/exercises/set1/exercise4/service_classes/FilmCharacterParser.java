package io.everyonecodes.java.t4_methods.exercises.set1.exercise4.service_classes;

import io.everyonecodes.java.t4_methods.exercises.set1.exercise4.data_classes.FilmCharacter;

import java.lang.reflect.Array;

public class FilmCharacterParser {
    public static FilmCharacter parser(String fullName){
        String[] splitName = fullName.split(";",0);
        FilmCharacter character = new FilmCharacter(splitName[0],splitName[1]);
        return character;
    }
}
