package lab11;

public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public Payment createPayment(){
        return new CreditCardPayment();
    }
}
