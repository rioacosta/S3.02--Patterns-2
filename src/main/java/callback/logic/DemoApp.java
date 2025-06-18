package callback.logic;

import callback.entities.BankTransferPayment;
import callback.entities.CreditCardPayment;
import callback.entities.PayPalPayment;
import callback.interfaces.PaymentMethod;

public class DemoApp {
    public static void start() {
        TheShoeStore store = new TheShoeStore();

        PaymentMethod cardPayment = new CreditCardPayment("4123456789012345", 404);
        PaymentMethod bankAccount = new BankTransferPayment("ES1234567891011121314151");

        PaymentMethod payPalPayment = new PayPalPayment("esto no es un correo electronico");
        store.sellSomething(79.60, payPalPayment);
        payPalPayment = new PayPalPayment("esto@si.es");
        store.sellSomething(79.60, payPalPayment);
        System.out.println("");
        store.sellSomething(45.35, bankAccount);
        System.out.println("");
        store.sellSomething(36.40, cardPayment);


    }
}
