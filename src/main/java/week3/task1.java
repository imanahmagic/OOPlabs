package week3;

//In this task, your goal is to create a Java program that
// exemplifies object-oriented programming principles by implementing a Task Management System.
// Your task is to design a class named TaskItem which should have
// three attributes: taskId (an integer representing a unique identifier for each task),
// taskDescription (a string describing the task),
// and taskStatus (an enum representing the status of the task with values such as TO_DO, IN_PROGRESS, COMPLETED, and CANCELLED)
// then, we have to create a method to get all objects, create a method getByStatus that will accept a
// Status parameter and filter the tasks with the provided status, create a method to find tasks whose id parameter
// is greater than or equal to 2,
// and create a method that will, by using forEach stream method, print to the console the description of each task

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

class TaskItem {
    public static void main(String[] args){

    }
    public enum taskStatus {
        TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
    }
    public int taskId;
    public String taskDescription;
    public static taskStatus taskStatus;

    public TaskItem(int id, String description, taskStatus status) {
        this.taskId = id;
        this.taskDescription = description;
        taskStatus = status;
    }
}

class DataStructures {
    public static void main(String[] args){

    }
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskItem.taskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskItem.taskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskItem.taskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }


    public List<TaskItem> getByStatus(TaskItem.taskStatus status) {
        return tasks
                .stream()
                .filter(task -> {return task.taskStatus.equals(status);}).toList();
    }



    public List<TaskItem> getById() {
        return tasks
                .stream()
                .filter(task -> {return task.taskId>= 2;}).toList();
    }


    public void printDescription(){
        tasks
                .stream()
                .forEach(task -> {
                    System.out.println(task.taskDescription);});
    }
}

class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/CHANGE";
    private static final String USERNAME = "CHANGE";
    private static final String PASSWORD = "CHANGE";


    private Connection connection = null;


    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



