package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    String firstName;
    String lastName;
    Map<Subject, Grade> gradesMap = new HashMap<>();

    // constructors
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Map<Subject, Grade> getGradesMap() {
        return gradesMap;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addSubjectGrade(Subject subject, Grade grade){
        this.gradesMap.put(subject,grade);
    }
}
