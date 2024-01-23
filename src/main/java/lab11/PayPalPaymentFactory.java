package lab11;

public class PayPalPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment(){
        return new PayPalPayment();
    }
}
