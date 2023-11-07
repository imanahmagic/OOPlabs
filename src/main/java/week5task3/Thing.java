package week5task3;

import java.util.Objects;

public class Thing {
    private String name;

    private double weight;

    public Thing(String name){
        this.name = name;
    }

    public Thing(String name, double weight){
        this.name = name;
        if(weight>=0){
            this.weight = weight;
        }
        else throw new IllegalArgumentException("Weight cannot be negative");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        else{
            return false;
        }
    }
    public int hashCode(){
        Object o = null;
        return Objects.hash(o);
    }

    public void add(Thing thing) {
        Thing other = this;
        while (true) {
            other = thing;
        }
    }


}
