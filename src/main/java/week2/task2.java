package week2;
import java.util.Scanner;

//Create a program that asks the user for three numbers and then prints their sum.

public class task2 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        int read;
        int sum =0;
        for(int i=1; i<=3; i++){
            if(i==1){
                System.out.println("Enter first number: ");
                read = num.nextInt();
                sum+=read;
            }
            if(i==2){
                System.out.println("Enter second number: ");
                read = num.nextInt();
                sum+=read;
            }
            if(i==3){
                System.out.println("Enter third number: ");
                read = num.nextInt();
                sum+=read;
            }

        }
        System.out.println("Sum: "+ sum);
    }
}
