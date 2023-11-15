package week6;

import java.util.Arrays;
import java.util.Scanner;

public class BSMain {
    public static void main(String[] args) {
        int[] arr = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        int result = BinarySearch.search(arr, Integer.parseInt(searchedValue));
    }
}
