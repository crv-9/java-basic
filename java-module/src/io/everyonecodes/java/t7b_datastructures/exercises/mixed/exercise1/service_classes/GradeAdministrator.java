package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Grade;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Student;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise1.data_classes.Subject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeAdministrator {

    // as a key i'm using the username = lastname+firstname
    private Map<String, Student> userStudentMap = new HashMap<>();
    public GradeAdministrator(List<Student> studentList){
        for (Student student: studentList) {
            userStudentMap.put(student.getLastName()+student.getFirstName(), student);
        }
    }

    public void assignGrade(Student student, Subject subject, Grade grade){
        String username = student.getLastName()+student.getFirstName();

        if (userStudentMap.containsKey(username)){
            userStudentMap.get(username).addSubjectGrade(subject, grade);
        } else {// I decided it was not necessary to throw any error/exception - and I then added it
            throw new IllegalArgumentException(student.getFirstName()+ " " + student.getLastName() + " is not registered in the system, you can't assign a grade.");
        }
    }

    public void printGrade(Student student, Subject subject){
        String username = student.getLastName()+student.getFirstName();
        if (userStudentMap.containsKey(username)){
            // we go in if the student exists
            if (userStudentMap.get(username).getGradesMap().containsKey(subject)){
                // we go in if the subject/grade exists
                // in variable for reading purposes
                int subjectGrade = userStudentMap.get(username).getGradesMap().get(subject).getNumber();

                System.out.println(student.getFirstName()+ " " + student.getLastName() + " has a " + subjectGrade + " in " + subject.getName() + ".");

            } else {
                System.out.println(student.getFirstName()+ " " + student.getLastName() + " does not have a grade for " + subject.getName() + ".");
            }
        } else {
            System.out.println(student.getFirstName()+ " " + student.getLastName() + " is not registered in the system, you can't get a grade for that subject.");
        }

    }

    // extra - just for fun
    // it will print all grades for this student
    public void printAllGrades(Student student){
        String username = student.getLastName()+student.getFirstName();

        if (userStudentMap.containsKey(username)){
            System.out.println(userStudentMap.get(username).getFirstName() + " " + userStudentMap.get(username).getLastName() + " has the following grades in the system:");
            userStudentMap.get(username).getGradesMap()
                    .forEach((key, value) -> System.out.println("Subject: " + key.getName() + "-- Grade: " + value.getNumber()));
        }
    }
}
