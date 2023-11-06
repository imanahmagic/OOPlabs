package week4task2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType fill, double width, double height){
        super(color, fill);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getFill());
    }
    @Override
    public double getArea(){
        double area = getHeight() * getWidth();
        return area;
    }
}
