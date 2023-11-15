package week6;

public class BinarySearch {

    public static int search(int[] array, int searchedValue) {
        int left = 0;
        int right = array.length -1;
        while(left <= right){
            int m = left + (right-left)/2;
            if(array[m] == searchedValue){
                return m;
            }
            if(array[m] < searchedValue){
                left = m+1;
            }
            else{
                right = m-1;
            }


        }
        return -1;
        }

    }

