package io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes;

import java.util.Objects;

public class Character {
    String name;
    int nameLength;
    int bookOfDeath;
    String gender;


    public Character(String name, int bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public Character(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public int getNameLength() {
        return nameLength;
    }

    public void setNameLength(int nameLength) {
        this.nameLength = nameLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return bookOfDeath == character.bookOfDeath && Objects.equals(name, character.name) && Objects.equals(gender, character.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bookOfDeath, gender);
    }

}
