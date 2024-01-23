package lab8;

import java.util.ArrayList;

public class GradeAnalyzer {
    ArrayList<Double> grades = new ArrayList<>();

    public GradeAnalyzer(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double calculateAvgGrade(ArrayList<Double> grades) {
        double sum = 0;
        double avg_grade = sum / grades.toArray().length;
        for (double g : grades) {
            sum += g;
        }
        return avg_grade;
    }

    public void printSummary() {
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAvgGrade(grades));
    }
}
