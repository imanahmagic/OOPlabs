package lab11task6;

import java.util.ArrayList;
import java.util.Arrays;

public class LatteBuilder implements CoffeeBuilder{
        private Coffee coffee;

        public void setCoffee(Coffee coffee) {
            this.coffee = coffee;
        }
        @Override
        public void buildType(){
            System.out.println("Type: Latte");
        }
        @Override
        public void buildSize(){
            System.out.println("Medium");
        }
        public void buildToppings(){
            coffee.setToppings((ArrayList<String>) Arrays.asList("Foam"));
        }
    }

