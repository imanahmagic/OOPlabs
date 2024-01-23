package lab11task6;

import java.util.ArrayList;
import java.util.Arrays;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public void buildType(){
        System.out.println("Type: Espresso");
    }
    @Override
    public void buildSize(){
        System.out.println("Large");
    }
    public void buildToppings(){
        coffee.setToppings((ArrayList<String>) Arrays.asList("Cream", "Caramel"));
        ArrayList<String> toppings = coffee.getToppings();
        System.out.println(toppings);
    }

}
