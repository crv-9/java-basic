package io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes;

import java.util.Objects;

public class HappinessRecord {
    String country;
    int rank;
    double score;

    public HappinessRecord(String country, int rank, double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord that = (HappinessRecord) o;
        return rank == that.rank && Double.compare(score, that.score) == 0 && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, rank, score);
    }
}
