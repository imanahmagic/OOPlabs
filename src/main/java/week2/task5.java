package week2;
import java.util.Scanner;

//Create a program that calculates the sum of 20+21+22+...+2n,
// where n is a number entered by the user. The notation 2i means raising the number 2 to the power of i,
// for example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly,
// but instead we can calculate the power with the command Math.pow(number, power).
// Note that the command returns a number of double type (i.e. floating point number). A double can be converted
// into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23 to variable result.

public class task5 {
    public static void main (String[] args){
        int result =0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the power: ");
        int num = number.nextInt();
        for(int i=0; i<=num; i++){
            result+= (int)Math.pow(2, i);
        }
        System.out.println("Result is: "+ result);

    }
}
