package lab11;

public class Main2 {
    public static void main(String[] args) {
        // Using factories to create payment objects
        PaymentFactory ccf = new CreditCardPaymentFactory();
        Payment ccp = ccf.createPayment();
        ccp.processPayment();

        PaymentFactory ppf = new PayPalPaymentFactory();
        Payment ppp = ppf.createPayment();
        ppp.processPayment();
    }
}
