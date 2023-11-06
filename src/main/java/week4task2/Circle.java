package week4task2;

class Circle extends Shape{
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
    public double getArea(){
        double pi = 3.14;
        double area = pi * (radius*radius);
        return area;
    }




    public double calculateCircumference(double pi, double r){
        return 2*pi*r;
    }
    public double calculateCircumference(double r){
        double pi=3.14;
        return 2*pi*r;
    }
}
