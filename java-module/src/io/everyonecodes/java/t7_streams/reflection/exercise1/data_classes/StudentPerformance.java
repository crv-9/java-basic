package io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes;

import java.util.Objects;

public class StudentPerformance {
    String gender;
    String parentalEducation;
    int mathScore;
    int readingScore;
    int writingScore;

    public StudentPerformance(String gender, String parentalEducation, int mathScore, int readingScore, int writingScore) {
        this.gender = gender;
        this.parentalEducation = parentalEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalEducation() {
        return parentalEducation;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public int getWritingScore() {
        return writingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentPerformance that = (StudentPerformance) o;
        return mathScore == that.mathScore && readingScore == that.readingScore && writingScore == that.writingScore && Objects.equals(gender, that.gender) && Objects.equals(parentalEducation, that.parentalEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, parentalEducation, mathScore, readingScore, writingScore);
    }
}
