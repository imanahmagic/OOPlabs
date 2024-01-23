package lab8;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;

    ArrayList<Double> grades = new ArrayList<>();

    public Student(String name, String id, ArrayList<Double> grades){
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
    public void printInfo(){
        System.out.println("Student name: " + this.name);
        System.out.println("Student ID: " + this.id);
        System.out.println("Student grades: (" + this.grades + ")");
    }
}
