package lab11task6;

import java.util.ArrayList;

public class Coffee {
    private String type;
    private double size;
    ArrayList<String> toppings = new ArrayList<>();

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }
}
