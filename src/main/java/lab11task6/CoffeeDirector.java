package lab11task6;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder){
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}
