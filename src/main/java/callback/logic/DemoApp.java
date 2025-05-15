package callback.logic;

import callback.entities.CreditCardPayment;
import callback.entities.PayPalPayment;
import callback.interfaces.PaymentMethod;

public class DemoApp {
    public static void start() {
        TheShoeStore store = new TheShoeStore();

        PaymentMethod cardPayment = new CreditCardPayment("4123456789012345", 404);
        PaymentMethod payPalPayment = new PayPalPayment("esto no es un correo electronico");

        store.sellSomething(36.40, cardPayment);
        store.sellSomething(79.60, payPalPayment);
    }
}
