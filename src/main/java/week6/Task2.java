package week6;


public class Task2 {

    public static int indexOfTheSmallest(int [] array){
        int smallest_num = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<smallest_num){
                smallest_num=i;
            }
        }
        return smallest_num;
    }

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of smallest value: " + indexOfTheSmallest(values));
    }
}
