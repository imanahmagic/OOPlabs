package week4task2;

enum FillType{
    FILLED, NOT_FILLED
}
public abstract class Shape {
    private String color;
    private FillType fill;
    public double area = 1;

    public Shape(String color, FillType fill){
        this.color = color;
        this.fill = fill;
    }
    public Shape(double area){
        this.area = area;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public FillType getFill(){
        return this.fill;
    }
    public void setFill(FillType fill){
        this.fill = fill;
    }


    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getFill());

    }

    public double getArea(){
        return area;
    }

    public abstract double getArea(double area);
}
