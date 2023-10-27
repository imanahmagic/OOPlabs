package week2;

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

public class task9 {
    private static void drawNumbersPyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawNumbersRowsPyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        drawNumbersPyramid(5);
        drawNumbersRowsPyramid(10);

    }
}
