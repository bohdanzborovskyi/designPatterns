package org.example.Behavioral.Strategy;

public class Example {

    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPaymentStrategy("1234-5678-9876-5432"));
        cart1.checkout(250);

        ShoppingCart cart2 = new ShoppingCart(new PayPalPaymentStrategy("user@example.com"));
        cart2.checkout(300);
    }
}
