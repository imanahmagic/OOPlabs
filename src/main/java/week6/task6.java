package week6;

public class task6 {
    public static void printElegantly(int[] array){
        int size = array.length-1;
        int first = array[0];
        System.out.print(first);

        for(int i = 1; i<=size; i++){
            System.out.print(", " + array[i]);

            }

        }


    public static void main(String[] args) {
        int [] array = {2, 5, 4, 7, 6, 1};
        printElegantly(array);
    }
}
