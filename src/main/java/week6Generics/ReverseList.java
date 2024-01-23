package week6Generics;

public class ReverseList <T>{
    private T[] list;

    public ReverseList(T[] list){
        this.list = list;
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }
    public void reverse(T[] array){
        for(int i =array.length -1; i>=0; i--){
            System.out.println(array[i] + " ");

        }
    }
}
