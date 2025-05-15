package callback.entities;

import callback.interfaces.PaymentCallBack;
import callback.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    private final int cvv;
    public CreditCardPayment(String cardNumber, int cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    @Override
    public void pay(double amount, PaymentCallBack callback) {
        if (cardNumber.length() == 16) {
            callback.paymentSuccessful();
        } else {
            callback.paymentUnsuccessful();
            System.out.println("Tarjeta inválida");
        }
    }
}