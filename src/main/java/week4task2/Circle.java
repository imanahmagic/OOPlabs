package week4task2;

public class Circle extends Shape{
    private double radius;

    public Circle (String color, FillType fill, double radius){
        super(color, fill);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getFill());

    }

    @Override
    public double getArea(double area){
        double pi = 3.14;
        return area = pi * (radius*radius);
    }
    public double calculateCircumference(double pi, double r){
        return 2*pi*r;
    }
    public double calculateCitcumference(double r){
        double pi=3.14;
        return 2*pi*r;
    }
}
