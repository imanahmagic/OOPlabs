package lab11;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Processing PayPal payment");
    }
}
