package week4task2;

public class mainOne {
    public static void main(String[] args) {
        Circle circle = new Circle ("red", FillType.FILLED, 3);
        System.out.println(circle.getArea());
        System.out.println(circle.calculateCircumference(10, 4));
        System.out.println(circle.calculateCitcumference(5));
    }
}
