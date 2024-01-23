package week6Generics;

public class returnSum <T>{
    private T[] array;
     public returnSum(T[] array){
         this.array = array;
     }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public <T extends Number> int [] returnSumOfNums(T[] array){
         int even_sum=0;
         int odd_sum=0;

         for(T i: array){
            int valueInt = i.intValue();
             if(valueInt%2 == 0){
                 even_sum+=valueInt;
             }
             else
                 odd_sum+=valueInt;
         };
        return new int[0];
    }
}
