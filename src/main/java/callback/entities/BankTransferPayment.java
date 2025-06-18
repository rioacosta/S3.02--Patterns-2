package callback.entities;

import callback.interfaces.PaymentCallBack;
import callback.interfaces.PaymentMethod;

public class BankTransferPayment implements PaymentMethod {
    private final String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount, PaymentCallBack callback) {
        if (accountNumber.length() == 24) {
            System.out.println("Pago con transferencia autorizado");
            callback.paymentSuccessful();
        } else {
            callback.paymentUnsuccessful();
            System.out.println("Numero de cuenta invalida");
        }
    }
}
