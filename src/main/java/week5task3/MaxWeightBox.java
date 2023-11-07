package week5task3;

import java.util.Collection;

public class MaxWeightBox extends Box{
    private int maxWeight;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    @Override
    public void add(Thing thing){
        thing.add(thing);
    }

    @Override
    public void add(Collection<Thing> things){
        for(Thing thing : things){
            if(thing.getWeight() <= maxWeight) {
                add(thing);
            }
        }
    }
    @Override
    public boolean isInTheBox(Thing thing){
        if(thing.equals(thing.getName())){
            return true;
        }
        else{
            return false;
        }

    }
    public String toString(){
        Thing thing = null;
        if(isInTheBox(thing) == true){
            return "true";
        }
        else{
            return "false";
        }


    }
}
