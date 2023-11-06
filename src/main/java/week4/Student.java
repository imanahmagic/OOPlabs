package week4;

import java.util.ArrayList;

public class Student extends Person{
    private int credits =0;
    private int student_id;
    ArrayList<Double> grades = new ArrayList<>();

    public Student(String name, String address){
        super(name, address);
    }
    public Student(int credits){
        super(" ", " ");
        this.credits = credits;
    }
    public Student (String name, String address, int student_id, ArrayList grades){
        super(name, address);
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }
    public int getCredits(){
        return this.credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getStudent_id(){
        return this.student_id;
    }
    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }
    public ArrayList<Double> getGrades(){
        return this.grades;
    }
    public void setGrades(ArrayList<Double> grades){
        this.grades = grades;
    }

    public void addGrades(double grade){
            getGrades().add(grade);
    }

    void study(){
        credits++;
    }
}
