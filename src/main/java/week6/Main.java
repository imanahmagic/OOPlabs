package week6;

public class Main {

    public static int smallest(int [] array){
        int smallest_num = array[0];
        for(int num: array){
            if(num<smallest_num){
                smallest_num=num;
            }
        }
        return smallest_num;
    }
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }


}
