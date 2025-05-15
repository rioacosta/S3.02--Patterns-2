package callback.interfaces;

public interface PaymentMethod {
    void pay(double amount, PaymentCallBack callback);
}
