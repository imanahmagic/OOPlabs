package week2;
import java.util.Random;
import java.util.Scanner;

//The program that comes with the exercise contains a command
// called drawNumber. It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible).
// Create a program that draws a number. Then the user has the chance to guess once, what the number is.
// The program should print "The number is lesser",
// "The number is greater" or "Congratulations, your guess is correct!" depending on the number the user typed.

public class task10 {

    private static int drawNumber() {
        return new Random().nextInt(101);
    }

    public static void main(String[] args){
        int x = drawNumber();
        int counter=0;
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("Guess a number: ");
            int read = reader.nextInt();
            counter++;
            if(read>x){
                System.out.println("The number is lesser, guesses made: " + counter);

            }
            else if(read<x){
                System.out.println("The number is greater, guesses made: " + counter);

            }
            else{
                System.out.println("The number is correct! Have a cookie");
                break;
            }
        }

    }
}