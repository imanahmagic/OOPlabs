package lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSystem {

    List<Student> students;
    public StudentSystem(String file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));


    }

    public static void main(String[] args) throws IOException{
        StudentSystem ss = new StudentSystem("students.csv");
        for(Student student: ss.students){
            System.out.println(student);
        }
    }
    public void readStudents(String file) throws IOException{
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        bufferedReader.lines().collect(Collectors.toList());
        for(Student stu : students){
            System.out.println(students.spliterator());
        }
    }
}
