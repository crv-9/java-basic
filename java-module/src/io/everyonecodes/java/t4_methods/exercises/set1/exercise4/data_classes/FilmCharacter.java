package io.everyonecodes.java.t4_methods.exercises.set1.exercise4.data_classes;

public class FilmCharacter {
    String firstName;
    String lastName;

    public FilmCharacter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
