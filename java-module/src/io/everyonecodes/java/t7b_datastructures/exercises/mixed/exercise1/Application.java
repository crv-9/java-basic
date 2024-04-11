package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1;

import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Grade;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Student;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Subject;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.service_classes.GradeAdministrator;

import java.util.List;

// took me 1:30hr to solve

public class Application {
    public static void main(String[] args) {
        Student max = new Student("Max", "Mustermann");
        Student samuel = new Student("Samuel", "Heitor");
        Student siegfried = new Student("Siegfried", "Haitung");

        List<Student> studentList = List.of(max, samuel);

        GradeAdministrator gradeAdministrator = new GradeAdministrator(studentList);

        gradeAdministrator.assignGrade(max, Subject.GERMAN, Grade.GOOD);
        gradeAdministrator.assignGrade(max, Subject.ENGLISH, Grade.VERY_GOOD);
        gradeAdministrator.assignGrade(max, Subject.PSYCHOLOGY, Grade.ADEQUATE);

        gradeAdministrator.assignGrade(samuel, Subject.GERMAN, Grade.SATISFACTORY);
        gradeAdministrator.assignGrade(samuel, Subject.ENGLISH, Grade.GOOD);
        gradeAdministrator.assignGrade(samuel, Subject.MATHS, Grade.VERY_GOOD);

        // Should print that the student was not registered.
        gradeAdministrator.printGrade(siegfried, Subject.GERMAN);
        // Should print the grade.
        gradeAdministrator.printGrade(max, Subject.GERMAN);
        // Should print that the student doesn't have any grade in that subject.
        gradeAdministrator.printGrade(max, Subject.HISTORY);
        //Should print the grade.
        gradeAdministrator.printGrade(samuel, Subject.GERMAN);

        // extra

        gradeAdministrator.printAllGrades(max);
        gradeAdministrator.printAllGrades(samuel);

    }
}
