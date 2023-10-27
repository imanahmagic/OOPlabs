package week2;

//Create a method called drawStarsPiramid that will accept the number of rows
// as a parameter and print a half piramid shape where the number of rows will be dictated by the sent parameter.
//how to draw an inverted half pyramid shape

public class task8 {

    private static void drawStarsPyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void invertedPyramid(int rows){
        for (int i=rows; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawStarsPyramid(5);
        invertedPyramid(10);
    }
}
