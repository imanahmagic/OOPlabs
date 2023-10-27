package week2;
import java.util.Scanner;

//Create a program that reads numbers from the user and prints their sum.
// The program should stop asking for numbers when the user enters the number 0

public class task3 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int sum=0;
        while (true){
            int read = reader.nextInt();
            if(read == 0) {
                break;
            }

            if(read>0){
                sum+=read;
            }

            System.out.println("Sum now: "+ sum);
        }
        System.out.println("Sum in the end: " + sum);

    }
}
