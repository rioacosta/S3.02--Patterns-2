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
        if (email.contains("@") && payPalApprove()) {
            callback.paymentSuccessful();
            System.out.println("Cuenta validada");
        } else {
            callback.paymentUnsuccessful();
            System.out.println("Cuenta PayPal inválida");
        }
    }
    private boolean payPalApprove() {
        return true;
    }
}
