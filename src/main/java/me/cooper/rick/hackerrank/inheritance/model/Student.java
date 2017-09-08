package me.cooper.rick.hackerrank.inheritance.model;

import java.util.Arrays;

public final class Student extends Person {

    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(idNumber, firstName, lastName);
        this.scores = scores;
    }

    private double calculateAverageScore() {
        return Arrays.stream(scores).average().orElse(0.0D);
    }

    public String calculate() {
        double averageScore = calculateAverageScore();
        String grade = "O";
        if (averageScore < 40) {
            grade = "T";
        } else if (isBetween(averageScore, 40, 55)) {
            grade = "D";
        } else if (isBetween(averageScore, 55, 70)) {
            grade = "P";
        } else if (isBetween(averageScore, 70, 80)) {
            grade = "A";
        } else if (isBetween(averageScore, 80, 90)) {
            grade = "E";
        }
        return grade;
    }

    private boolean isBetween(double score, int lowerBoundInclusive, int upperBoundExclusive) {
        return score >= lowerBoundInclusive && score < upperBoundExclusive;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nGrade: %s", calculate());
    }

}
