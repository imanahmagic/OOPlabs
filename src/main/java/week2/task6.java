package week2;
import java.util.Scanner;

//Develop the program by adding the following feature: the main program should ask the user how many times the text should be printed

public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times the sentence will be written: ");
        int user_num = scanner.nextInt();
        for(int i=1; i<=user_num; i++){
            printText();
        }


    }
    public static int printText(){
        System.out.println("In the beginning there were the swamp, the hoe, and Java");
        return 0;
    }
}
