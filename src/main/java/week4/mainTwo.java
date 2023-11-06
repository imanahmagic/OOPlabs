package week4;

import java.util.ArrayList;

public class mainTwo {
    public static void main(String[] args) {
        ArrayList<Double> ollis_grades = new ArrayList<>();
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", 2345, ollis_grades);
        System.out.println(olli);
        System.out.println("credits " + olli.getCredits());
        olli.study();
        System.out.println("credits " + olli.getCredits());
        olli.addGrades(2);
        olli.addGrades(3);
        System.out.println(olli.getGrades());

    }
}
