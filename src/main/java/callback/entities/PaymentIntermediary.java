package callback.entities;

import callback.interfaces.PaymentCallBack;
import callback.interfaces.PaymentMethod;

public class PaymentIntermediary {
    public void processPayment(double amount, PaymentMethod method, PaymentCallBack callback) {
        method.pay(amount, callback);
    }
}