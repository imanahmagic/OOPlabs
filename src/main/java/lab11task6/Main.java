package lab11task6;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector cd = new CoffeeDirector();
        CoffeeBuilder eb = new EspressoBuilder();
        cd.constructCoffee(eb);
    }
}
