package week2;
import java.util.Scanner;

//Create a program that asks the user
// for a password. If the password is right, a secret message is shown to the user.

public class task1 {
    public static void main (String[] args){
        String correct_pass = "iman";
        while (true){
            Scanner pass = new Scanner (System.in);
            System.out.println("Please enter the password: ");
            String user_pass = pass.nextLine();
            if(!user_pass.equals(correct_pass)){
                System.out.println("Wrong");
            }
            else {
                System.out.println("The mitochondria in not a powerhouse because its a plural word");
                break;
            }

        }
    }
}
