package org.example.Behavioral.Strategy;

public class ShoppingCart {

    private PaymentStrategy paymentMethod;

    public ShoppingCart(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(int amount) {
        paymentMethod.pay(amount);
    }

}
