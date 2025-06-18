package callback.entities;

import callback.interfaces.PaymentCallBack;
import callback.interfaces.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount, PaymentCallBack callback) {
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") && payPalApprove()) {
            System.out.println("Cuenta validada");
            callback.paymentSuccessful();
        } else {
            callback.paymentUnsuccessful();
            System.out.println("Cuenta PayPal invalida");
        }
    }
    private boolean payPalApprove() {
        return true;
    }
}
