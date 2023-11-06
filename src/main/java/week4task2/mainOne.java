package week4task2;

public class mainOne {
    public static void main(String[] args) {
        Circle circle = new Circle ("red", FillType.FILLED, 3);
        System.out.println(circle.getArea());
        System.out.println(circle.calculateCircumference(10, 4));
        System.out.println(circle.calculateCircumference(5));

        Rectangle rect = new Rectangle("blue", FillType.NOT_FILLED, 4, 2);
        rect.displayInfo();
        System.out.println(rect.getArea());
    }
}
