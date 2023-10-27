package week2;
import java.util.Scanner;

//Create a program that asks the user for the first number
// and the last number and then prints all numbers between those two. Use a while loop

public class task4 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("First: ");
        int first = num.nextInt();
        System.out.println("Last: ");
        int last = num.nextInt();
        while(true){
            if(last<first){
                break;
            }
            System.out.println(first);
            first++;
            if(first==last){
                System.out.println(last);
                break;
            }
        }
    }
}
