package week5;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maxWeight;
    ArrayList<ToBeStored> things = new ArrayList<>();

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public ArrayList<ToBeStored> getThings() {
        return things;
    }

    public void setThings(ArrayList<ToBeStored> things) {
        this.things = things;
    }
    @Override
    public double weight(){
        double totalWeight =0;
        for(ToBeStored thing : things){
            totalWeight +=thing.weight();
        }
        return totalWeight;
    }

    public String toString(){
        return "Box: " + this.things.size() + " things" + " total weight " + weight() + " kg";
    }

    public void add(ToBeStored thing) {
        if(this.weight() <= this.maxWeight ){
            this.things.add(thing);
        }
    }
}
