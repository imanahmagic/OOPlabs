package week6;

public class task3 {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest=index;
        for(int i=index+1; i<array.length; i++){
            int num = i;
            if(array[num]<array[smallest]){
                smallest = num;
            }

        }
        return smallest;

    }

    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
}
