package callback.logic;

import callback.entities.PaymentIntermediary;
import callback.interfaces.PaymentCallBack;
import callback.interfaces.PaymentMethod;

public class TheShoeStore {

    private final PaymentIntermediary paymentIntermediary = new PaymentIntermediary();

    public void sellSomething(double amount, PaymentMethod paymentMethod) {

        paymentIntermediary.processPayment(amount, paymentMethod, new PaymentCallBack() {

            @Override
            public void paymentSuccessful() {

                System.out.println("¡Pago realizado con éxito! Gracias por su compra.");
            }

            @Override
            public void paymentUnsuccessful() {

                System.out.println("Error en el pago");
            }
        });
    }
}
